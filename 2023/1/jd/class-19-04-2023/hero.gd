extends Node

class Hero:
	var name = "" setget set_name, get_name
	
	func set_name(var nm):
		name = nm
		pass
	
	func get_name():
		return name
		pass

func _ready():
	var h1 = Hero.new()
	h1.name = "Superman"
	print(h1.name)
	
	var h2 = Hero.new()
	h2.name = "Sonic"
	print(h2.name)
	pass
