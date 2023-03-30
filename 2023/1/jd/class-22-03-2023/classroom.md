# Importando a biblioteca Node
```py
extends Node
```

## Função:  um conjunto de códigos com um nome.
### ```func _ready()``` - função principal que executa o script

```py
func _ready():
    #impresso na tela do texto
    print("Hello world!")
    print("Rolfi")
    print("Teste")

    var nome = "Ana"
    print(nome)

    var email = "Ana1@gmail.com"#AZaz0-9@.
    print(email)

    #inteiro - int
    var idade = 18
    print(idade)

    #real ou flutuante
    var peso = 85.1
    print(peso)

    #array
    var prateleiras = [67,10,-5,0.03,55,90,1111]

    #varivel
    var gaveta= 15
    print(prateleiras)
    print(gaveta)
```

<br>

```
String - AZaz09@#$%¨&*())
```
***Ex: email, nome, endereço completo, razão social***

<br>

```py
int - inteiro: 12 - 5 - 1750 - 6
```

```py
real - valores numéricos de 0-9.0-9
"fracionados, flutuantes - quebrados"
15.35 , 84.00 , 1.73 , 2.89
```

# Array
```py
var prateleiras = [67,10,-5,0.03,55,90,1111]
```

<br>

# Variável
```py
var gaveta = 15
```

![img](https://cultured-veil-1e2.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F364228e8-93f7-43f7-a2c7-9e5e6acc6c01%2FUntitled.png?id=3800f596-bfd1-437a-af50-973ebe0a8ba8&table=block&spaceId=a394d0d6-1d34-4f2b-9dbd-f5e1c51e5293&width=2000&userId=&cache=v2)

```py
    FUNÇÃO/PROCEDIMENTO

    extends Node

    func subtrair(numero,x):
        var resposta= numero-x
        return resposta

    func somar(a,b):
        var c= a + b
        return c

    func _ready():
    print(somar(1,2))
    print(somar(5,6))
    print(somar(10,11))
    print(subtrair(10,5))
    print(subtrair(4,2))
```