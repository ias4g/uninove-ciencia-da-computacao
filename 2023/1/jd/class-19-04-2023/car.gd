extends Node

var cor = "" setget set_cor, get_cor
var modelo = "" setget set_modelo, get_modelo
var marca = "" setget set_marca, get_marca

# Prata, i30, hyundai
# STAR VARIABLE COR -------------------------------------
func set_cor(color):
	cor = color
	pass

func get_cor():
	return cor
	pass
# END VARIABLE COR -------------------------------------

# STAR VARIABLE MODELO -------------------------------------
func set_modelo(mod):
	modelo = mod
	pass

func get_modelo():
	return modelo
	pass
# END VARIABLE MODELO -------------------------------------

# STAR VARIABLE MARCA -------------------------------------
func set_marca(mar):
	marca = mar
	pass

func get_marca():
	return cor
	pass
# END VARIABLE MARCA -------------------------------------

func _ready():
	# set - setandoos valores
	self.set_cor("Prata")
	self.set_modelo("i30")
	self.set_marca("Hyundai")
	
	# get - pegar os valores
	print(self.get_cor())
	print(self.get_modelo())
	print(self.get_marca())
	pass
