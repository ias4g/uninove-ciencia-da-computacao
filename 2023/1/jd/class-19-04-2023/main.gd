extends Node

class ObjectScene:
	var height = 10
	var width = 3
	var color = "Yellow"

func _ready():
	var obj = ObjectScene.new()
	print(obj.height)
	print(obj.width)
	print(obj.color)
	pass
