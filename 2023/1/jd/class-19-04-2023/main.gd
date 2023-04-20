extends Node

class Hero:
	var name = "" setget set_name, get_name
	
	func set_name(var nm):
		name = nm
		pass
	
	func get_name():
		return name
		pass
	pass

func _ready():
	var mario = Hero.new()
	mario.name = "Superman"
	print(mario.name)
	
	var sonic = Hero.new()
	sonic.name = "Sonic"
	print(sonic.name)
	
	var naruto = Hero.new()
	naruto.name = "Naruto"
	print(naruto.name)
	pass
