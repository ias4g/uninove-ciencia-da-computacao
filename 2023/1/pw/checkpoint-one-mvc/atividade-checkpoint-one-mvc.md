
# Atividade Checkpoint I - MVC

* Acessar o dotnet finddle [clicando aqui](https://dotnetfiddle.net/)!

### Crie um projeto para receber o nome completo e a data de nascimento do usuário.

<br>

#### Postar o link do dotnet finddle  na atividade do classroom

<hr>

<br>

***Resposta: 👇***
```c#
Model:

using System;
using System.ComponentModel.DataAnnotations;

namespace CheckPointMVC
{
	public class SampleViewModel
	{
		public string NomeCompleto { get; set; }

		public DateTime DataNascimento { get; set; }
	}
}
```

```c#
Controller:

using System;
using System.Web.Mvc;
using System.Collections.Generic;

namespace CheckPointMVC
{
	public class HomeController : Controller
	{
		public ActionResult Index()
		{
			return View();
		}

		[HttpPost]
		public ActionResult Index(SampleViewModel sampleViewModel)
		{
			if (ModelState.IsValid)
			{
				int idade = CalcularIdade(sampleViewModel.DataNascimento);
				ViewBag.Mensagem = "Olá " + sampleViewModel.NomeCompleto + "! Você tem " + idade + " anos.";
			}

			return View();
		}

		private int CalcularIdade(DateTime dataNascimento)
		{
			int idade = DateTime.Now.Year - dataNascimento.Year;
			if (DateTime.Now < dataNascimento.AddYears(idade))
				idade--;
			return idade;
		}
	}
}
```

```c#
View:

@model CheckPointMVC.SampleViewModel
@{
	Layout = null;
}

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>CheckPointMVC</title>
	</head>
	
	<body>
	<h1>Bem-vindo ao programa de nome e data de nascimento!</h1>

@if (ViewBag.Mensagem != null)
{
    <div class="alert alert-success">@ViewBag.Mensagem</div>
}
		<form method="post">
    <div class="form-group">
        <label for="NomeCompleto">Nome Completo:</label>
        <input type="text" class="form-control" id="NomeCompleto" name="NomeCompleto" required />
    </div>
    <div class="form-group">
        <label for="DataNascimento">Data de Nascimento:</label>
        <input type="date" class="form-control" id="DataNascimento" name="DataNascimento" required />
    </div>
    <button type="submit" class="btn btn-primary">Enviar</button>
</form>
	</body>
</html>
```

<br>

![](img/Captura%20de%20Tela%20(168).png)

<br>

***👉 Para executar o código online:***
[clique aqui](https://dotnetfiddle.net/FZPR2Y)

<br>
<br>

<p align="center">
	By <a href="https://github.com/ias4g" target="_blank">Silva, I. A.</a>
</p>