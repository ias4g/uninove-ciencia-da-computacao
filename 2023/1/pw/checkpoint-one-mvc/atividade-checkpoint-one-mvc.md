
# Atividade Checkpoint I - MVC

* Acessar o dotnet finddle [clicando aqui](https://dotnetfiddle.net/)!

### Crie um projeto para receber o nome completo e a data de nascimento do usuário.

<br>

#### Postar o link do dotnet finddle  na atividade do classroom

<hr>

<br>

***Resposta: 👇***

```
using System;

public class Program {
	
	public static void Main() {
		
		Console.Write("Bem-vindo ao programa de nome e data de nascimento: ");
		Console.WriteLine("\n");
		
		Console.Write("Por favor, digite seu nome completo: ");
		string nomeCompleto = Console.ReadLine();
		Console.WriteLine("\n");
		
		Console.Write("Agora, digite sua data de nascimento (no formato MM/DD/AAAA): ");
		DateTime dataNascimento;		
		
		while (!DateTime.TryParse(Console.ReadLine(), out dataNascimento)) {
			Console.WriteLine("Por favor, digite uma data de nascimento válida (no formato MM/DD/AAAA):");
		}
		
		Console.WriteLine("\n");

		// Validações das entradas do usuário
		if (string.IsNullOrEmpty(nomeCompleto)) {
			Console.WriteLine("Por favor, informe seu nome completo.");
			return;
		}

		if (dataNascimento > DateTime.Now) {
			Console.WriteLine("Por favor, informe uma data de nascimento válida.");
			return;
		}

		int idade = CalcularIdade(dataNascimento);
		Console.WriteLine("Olá, " + nomeCompleto + "! Você tem " + idade + " anos de idade");
	}

	private static int CalcularIdade(DateTime dataNascimento) {
		
		int idade = DateTime.Now.Year - dataNascimento.Year;
		
		if (DateTime.Now < dataNascimento.AddYears(idade)) {
			idade--;
		}
		
		return idade;
	}
}
```

<br>

***👉 Para executar o código online:***
[clique aqui](https://dotnetfiddle.net/SSYiCb)