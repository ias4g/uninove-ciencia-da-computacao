extends Node

var nome = "" setget set_name, get_name
var idade = 0 setget set_idade, get_idade
var email = "" setget set_email, get_email

func set_name(name):
	nome = name
	pass

func get_name():
	return nome
	pass

func set_idade(var i):
	idade = i
	pass

func get_idade():
	return idade
	pass

func set_email(var e):
	email = e
	pass

func get_email():
	return email
	pass
	

var cep = "123" #NÃO ESTÁ ENCAPSULADO - pode ser MODIFICADO POR QUALQUER UMEM QUALQUER MOMENTO

func _ready():
	print("Classe")
	self.set_name("Teste")
	print(self.get_name())
	
	self.cep = "321"
	print(self.cep)
	pass


