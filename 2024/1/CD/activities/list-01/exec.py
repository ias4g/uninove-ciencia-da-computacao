# Com base no que trabalhamos em sala de aula, em código Python faça os seguintes exercícios:
# Exercícios
#######################################################################################################################

# 1. Declare 4 variáveis numéricas
age = 31 # número inteiro
temperature = -45 # Número inteiro
complexNumber = 3-4j # Números complexos
pi = 3.14159 # Números de ponto flutuante
price = 19.90 # Números de ponto flutuante

print('\n')
print('RESPOSTAS DA QUESTÃO 01')
print('[', pi,'] -> [var=pi] este é um número do tipo: ', type(pi))
print('[', age,'] -> [var=age] este é um número do tipo: ', type(age))
print('[', price,'] -> [var=price] este é um número do tipo: ', type(price))
print('[', temperature,'] -> [var=temperature] este é um número do tipo: ', type(temperature))
print('[', complexNumber,'] -> [var=complexNumber] este é um número do tipo: ', type(complexNumber))
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 2. Declare 2 variáveis strings
name = 'Izael'
lastname = ' Alves Da Silva'
# ---------------------------------------------------------------------------------------------------------------------

# 3. Faça operações de soma, subtração, divisão, multiplicação e potência com as variáveis numéricas anteriormente declaradas
age_temp = temperature + age # Soma
price_pi = price - pi # Subtração
age_pi = age / pi # Divisão
pi_price = pi * price # Multiplicação
pot = age**2 # Potência
print('RESPOSTAS DA QUESTÃO 03')
print('A soma de TEMPERATURE e AGE é: ', age_temp)
print('A subtração de PRICE e PI é: ', price_pi)
print('A divisão de AGE e PI é: ', age_pi)
print('A multiplicação de PI e PRICE é: ', price_pi)
print('A potência de AGE é: ', pot)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 4. Faça operação de soma com as 2 variáveis strings anteriormente declaradas
print('RESPOSTAS DA QUESTÃO 04')
fullname = name + lastname
print('Meu nome completo é: ', fullname)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 5. Faça operação de soma com a 1 variável string e 1 variável numérica anteriormente declaradas
print('RESPOSTAS DA QUESTÃO 05')
stringNumber = name + str(age)
print(stringNumber)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 6. Construa a fórmula: (a + b + (c*3) + d2 + e1/2 – (f/5)) / 3 declarando cada uma das variáveis de a até f
a = 1
b = 2
c = 3
d = 4
e = 5
f = 6

res = (a+b+(c*3)+(d**2)+((e**1)/2)-(f/5))/3
print('RESPOSTAS DA QUESTÃO 06')
print(res)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 7. Declare variáveis dos tipos: inteiro, float, string, depois faça a transformação de inteiro para float, float para string, inteiro para string
total = 100 #int
money = 199.45 #float
taxa = '12' #string
int_to_float = float(total)
float_to_string = str(money)
int_to_string = int(taxa)
print('RESPOSTAS DA QUESTÃO 07')
print(total, 'era', type(total), 'agora é:', int_to_float, type(int_to_float))
print(money, 'era', type(money), 'agora é:', float_to_string, type(float_to_string))
print(taxa, 'era', type(taxa), 'agora é:', int_to_string, type(int_to_string))
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 8. Apresente o resto da divisão 125/7
res_disivion = 125 % 7
print('RESPOSTAS DA QUESTÃO 08')
print('O resto da divisão entre 125 e 7 é:', res_disivion)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 9. Declare 2 variáveis booleanas
is_active = True
has_added = False
# ---------------------------------------------------------------------------------------------------------------------

# 10. Exercite os operadores relacionais ou de comparação (4 exemplos)
print('RESPOSTAS DA QUESTÃO 10')
print('10 é maior que 5?', 10 > 5)
print('10 é menor que 5?', 10 < 5)
print('10 é igual a 5?', 10 == 5)
print('10 é diferente de 5?', 10 != 5)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 11. Exercite os operadores lógicos (3 exemplos)
op_and = is_active and has_added
op_or = is_active or has_added
op_not = not is_active
print('RESPOSTAS DA QUESTÃO 11')
print(op_and)
print(op_or)
print(op_not)
print('\n')
# ---------------------------------------------------------------------------------------------------------------------

# 12. Faça um INPUT com nome, idade, RA, Curso, Disciplina e semestre
nome = input('Digite seu nome: ')
idade = int(input('Digite sua idade: '))
ra = input('Digite seu registro academico[RA]: ')
curso = input('Digite seu curso: ')
disciplina = input('Digite sua disciplina: ')
semestre = int(input('Digite seu semestre: '))

print('RESPOSTAS DA QUESTÃO 12')
print('Olá! meu nome é', nome, 'e tenho', idade, 'anos de idade.')
print('Meu RA é', ra, 'e estou no', semestre,'semestre de', curso, 'e amo a disciplina de', disciplina)
# ---------------------------------------------------------------------------------------------------------------------