extends Control

func _ready():
	pass

func _process(delta):
	pass


func _on_Button_pressed():
	print($TextEdit.text)
	$Label.text = $TextEdit.text
	pass
