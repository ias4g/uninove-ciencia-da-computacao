extends Control

var Calculadora = preload("res://Calculadora.gd")

func _ready():
	pass


func _process(delta):
	pass


func _on_Button_pressed():
	var n1 = int($TextEdit.text)
	var n2 = int($TextEdit2.text)
	
	var calc = Calculadora.new()
	var rs = calc.sum(n1, n2)

	print(rs)
	#$Label.text=rs
	pass
