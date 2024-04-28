# 2024-04-26 - Atividade Presencial 

| PROF | ALUNO | RA |
|----------|----------|----------|
| ANTONIO ANDRADE   | IZAEL SILVA   | 922114939   |


## Acrescentar campo CPF no formulário de cliente e fazer todo processo até a gravação no Banco de Dados.

<br>

![alt text](image.png)

Partes relevantes relacionadas aos controles `cbBd` e `mtxtCpf`:

1. **cbBd (ComboBox)**:
   - `cbBd` parece ser um controle ComboBox que permite selecionar o banco de dados onde os dados do cliente serão gravados.
   - No método `FrmCliente()`, o índice 0 é selecionado por padrão, presumivelmente indicando uma opção padrão ou vazia.
   - No método `BtnGravar_Click`, é verificado se `cbBd.SelectedIndex` é diferente de 0 para determinar se um banco de dados foi selecionado.

2. **mtxtCpf (MaskedTextBox)**:
   - `mtxtCpf` é um controle MaskedTextBox usado para entrada formatada de números de CPF (Cadastro de Pessoa Física).
   - No método `TsbIncluir_Click`, `mtxtCpf` é habilitado para entrada quando um novo cliente está sendo incluído.
   - No método `Limpar()`, o conteúdo de `mtxtCpf` é limpo.
   - No método `BtnGravar_Click`, é verificado se `mtxtCpf.Text` está vazio para garantir que o campo CPF seja preenchido antes de gravar os dados do cliente.

---

<br>
<br>

Parte do `else` do método `BtnGravar_Click`. 

No código, o bloco `else` é acionado quando todas as condições anteriores para validar os campos de entrada não são atendidas, o que significa que os campos foram preenchidos corretamente. Aqui está uma análise do que acontece dentro do bloco `else`:

1. **Instância de Cadastro**:
   - Uma instância da classe `Cadastro` é criada com base nos dados inseridos nos campos de entrada (`txtNome`, `mtxtPhone` e `mtxtCpf`).

2. **Gravação dos Dados**:
   - O código verifica qual banco de dados foi selecionado no `ComboBox` (`cbBd`) usando `cbBd.SelectedIndex`.
   - Se o banco de dados selecionado for o índice 1, presume-se que seja o SQL Server, e o método `GravarWithSQL()` é chamado na instância de `Cadastro` para gravar os dados do cliente no SQL Server.
   - Se o banco de dados selecionado for o índice 2, presume-se que seja SQLite, e o método `GravarWithSQLite()` é chamado na instância de `Cadastro` para gravar os dados do cliente no SQLite.

3. **Limpeza e Atualização da Interface**:
   - Após a gravação bem-sucedida dos dados do cliente, os campos de entrada são limpos chamando o método `Limpar()`.
   - O grupo de opções (`grbOpcoes`) é ocultado.
   - Os campos de entrada (`txtNome`, `mtxtPhone` e `mtxtCpf`) são desabilitados.
   - O `ComboBox` é resetado para o índice 0, presumivelmente para selecionar a opção padrão ou vazia.

4. **Tratamento de Exceções**:
   - Qualquer exceção que ocorra durante a gravação dos dados é capturada no bloco `catch` e uma mensagem de erro é exibida em uma caixa de diálogo.

5. **Cursor do Mouse**:
   - Durante o processo de gravação, o cursor do mouse é alterado para um cursor de espera (`WaitCursor`) para indicar que a operação está em andamento. Após a conclusão da operação, o cursor é restaurado para o padrão (`DefaultCursor`).

---

<br>
<br>

O método `GravarWithSQLite()` é responsável por gravar os dados de um cliente em um banco de dados SQLite. Aqui está uma descrição detalhada do que o método faz:

1. **Construção da String de Conexão**:
   - A string de conexão para o banco de dados SQLite é construída usando `Path.Combine` para formar o caminho completo do arquivo de banco de dados. Este caminho é baseado no diretório base do domínio de aplicativo (`AppDomain.CurrentDomain.BaseDirectory`), combinado com a pasta "database" e o nome do arquivo SQLite ("db.sqlite").

2. **Bloco Try-Catch**:
   - O código está envolto em um bloco `try-catch` para capturar e tratar exceções que possam ocorrer durante o processo de gravação no banco de dados SQLite.

3. **Conexão com o Banco de Dados**:
   - Uma conexão `SQLiteConnection` é criada usando a string de conexão construída anteriormente.

4. **Comando SQL e Parâmetros**:
   - Um comando SQL (`SQLiteCommand`) é criado, com o comando de inserção (`strINSERT`) e a conexão SQLite associada.
   - Parâmetros são adicionados ao comando para inserir os dados do cliente (`PessoaNome`, `PessoaTelefone`, `PessoaCpf`) e `PessoaId`, que é gerado anteriormente com o método `GenerateFormattedUuid()`.

5. **Abertura da Conexão e Execução do Comando**:
   - A conexão é aberta.
   - O comando é executado usando `ExecuteNonQuery()` para inserir os dados na tabela do banco de dados.
   - A conexão é fechada para liberar recursos.

6. **Tratamento de Exceções**:
   - Se ocorrer uma exceção do tipo `SqlException` (provavelmente devido a erros de sintaxe SQL ou problemas de conexão), ela é relançada encapsulada em uma exceção do tipo `ArgumentException`.
   - Qualquer outra exceção genérica é capturada no bloco `catch (Exception ex)` e também relançada encapsulada em uma exceção do tipo `ArgumentException`.