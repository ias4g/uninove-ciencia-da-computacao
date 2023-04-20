extends Node

class ObjectScene:
	var height = 10
	var width = 3
	var color = "Yellow"
	pass

class Person:
	var name = "Izael Silva" setget set_name, get_name
	var email = "person@person.com.br" setget set_email, get_email
	
	func set_name(mn):
		name = mn
		pass
	
	func get_name():
		return name
		pass
		
	func set_email(em):
		email = em
		pass
	
	func get_email():
		return email
		pass
	
	pass

func _ready():
	var p = Person.new()
	print(p.name)
	print(p.email)

	var obj = ObjectScene.new()
	print(obj.height)
	print(obj.width)
	print(obj.color)
	pass
