extends Control

var Calculadora = preload("res://Calculadora.gd")

func _ready():
	pass


func _process(delta):
	pass


func _on_Button_pressed():
	var res = Calculadora.new()
	var rs = res.calculator.sum(int($TextEdit.text), int($TextEdit2.text))
	
	print(rs)
	#$Label.text=res
	pass
