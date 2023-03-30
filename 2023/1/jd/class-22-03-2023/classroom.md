```py
    extends Node

    #Return - retorno
    func subtrair(a,b):
    return a-b;

    #procedimento - instruções que executam
    func imprimir(nome):
    print('O nome é:',nome)

    func _ready():
        print("Hello world!")
        print( subtrair(3,1))
        imprimir('teste')
```

```py
    Recursão:
    Quando uma função/procedimento chama ou executa ela mesma.

    PROCEDIMENTO X FUNÇÃO

    extends Node

    func teste():
        print("teste")
        var a=5
        a=a+1;
        print(a)
    #return a

    #Return - retorno
    func subtrair(a,b):
    #imprimir('rolfi')
    var c= a-b;
    return c; #tratamento "conta" - Processar

    func somar(a,b):
    return a+b;

    func dividir(a,b):
    return a/b;

    func multiplicar(a,b):
    return a*b;

    func _ready():
        print("Hello world!")
        print( subtrair(3,1))
        print( somar(3,1))
        print( multiplicar(4,5))
        print(dividir(4,5))
        print(teste())
```

<br>

EXEMPLO DE FUNÇÃO ANDANDO.

![](https://cultured-veil-1e2.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd42e7b8b-c387-421c-8a1b-163a32236796%2FUntitled.png?id=40dc0b83-586e-4382-abef-e40cc0ca8d88&table=block&spaceId=a394d0d6-1d34-4f2b-9dbd-f5e1c51e5293&width=1950&userId=&cache=v2)

```py
    extends Node

    func moverdireita(posx1):
        return posx1+1;

    func moveresquerda(posx1):
        return posx1-1;

    func movercima(posy1):
        return posy1+3;

    func moverbaixo(posy1):
        return posy1-3;

    func moverdiagonalA(posx1):
    posx1=moverdireita(posx1)
    posx1=movercima(posx1)
    return posx1;

    func imprimirpos(pos):
        print("posição:", pos)
        
    func _ready():
        var posx = 5
        imprimirpos(posx)
        
        posx = moverdiagonalA(posx)
        
        posx = moveresquerda(posx)
        imprimirpos(posx)
        posx = moverdireita(posx)
        imprimirpos(posx)
        posx = moverdireita(posx)
        imprimirpos(posx)
        posx = movercima(posx)
        imprimirpos(posx)
        posx = moverbaixo(posx)
        imprimirpos(posx)
```

```py
    extends Node

    func moverdireita(posx1):
        return posx1+1;

    func moveresquerda(posx1):
        return posx1-1;

    func movercima(posy1):
        return posy1+3;

    func moverbaixo(posy1):
        return posy1-3;

    func moverdiagonalA(posx1):
    imprimirpos(posx1)
    posx1=moverdireita(posx1)
    imprimirpos(posx1)
    posx1=moverbaixo(posx1)
    imprimirpos(posx1)
    return posx1;

    func imprimirpos(pos):
        print("posição:", pos)
        
    func _ready():
        var posx = 5
        #imprimirpos(posx)
        posx = moverdiagonalA(posx)
        #imprimirpos(posx)
```