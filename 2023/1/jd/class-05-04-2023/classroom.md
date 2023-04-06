# Aula 05 | 05/04/2023

<br>

## Vetor

```py
    extends Node

    func moveresquerda(posicao):
        posicao.y= posicao.y-1
        print(posicao)
        return posicao
        
    func moverdireita(posicao):
        posicao.y= posicao.y+1
        print(posicao)
        return posicao

    func _ready():
        print("Aula de Vetor")
        #2D - eixo  x e eixo y
        var a= Vector2(0,0)
        var b= Vector2(0,1)
        var c=Vector2(0,2)
        var posicao= Vector2(0,1)
        print(posicao)
        moverdireita(posicao)
        moveresquerda(posicao)
```

<br>

## VARIÁVEL GLOBAL : é uma variável que todo o programa consegue ler
```py
    extends Node

    #GLOBAL
    var horizontal=3
    var vertical=3

    func moveresquerda(posicao):
        if posicao.y-1<0:
            print('posicao invalida')
        else:
            posicao.y-=1
        return posicao
        
    func moverdireita(posicao):
        if posicao.y+1>horizontal:
            print('posicao invalida')
        else:
            posicao.y+=1
        return posicao
        
    func movercima(posicao): #x y
        if posicao.x -1 < 0:
            print('posicao invalida')
        else:
            posicao.x = posicao.x-1
        return posicao

    func moverbaixo(posicao):
        if posicao.x+1> vertical:
            print("posicao invalida")
        else:
            posicao.x = posicao.x+1
        return posicao

    func moverdiagonalEC(posicao):
        posicao = moveresquerda(posicao)
        posicao = movercima(posicao)
        return posicao
        
    func moverdiagonalEB(posicao):
        posicao = moveresquerda(posicao)
        posicao = moverbaixo(posicao)
        return posicao


    func moverdiagonalDC(posicao):
        posicao = moverdireita(posicao)
        posicao = movercima(posicao)
        return posicao
        
    func moverdiagonalDB(posicao):
        posicao = moverdireita(posicao)
        posicao = moverbaixo(posicao)
        return posicao

    func imprimir(posicao):
        print(posicao)

    func _ready():
        print("Aula de Vetor")
        var posicao= Vector2(0,1)
        imprimir(posicao)
        posicao=moverdireita(posicao)
        imprimir(posicao)
        posicao=moverdireita(posicao)
        imprimir(posicao)
        posicao=moverdireita(posicao)
        imprimir(posicao)
        posicao=moverdireita(posicao)
        imprimir(posicao)
        posicao=moverdireita(posicao)
        imprimir(posicao)
        posicao = movercima(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverbaixo(posicao)
        imprimir(posicao)
        posicao = moverdiagonalEC(posicao)
        imprimir(posicao)
```

<br>

## LOOP - Comandos de Repetição - for
```py
    extends Node

    func _ready():
        print("Hello world!")
        #print('1')
        #LOOP - repetição
        for x in range(10):
            print('B')
```

<br>

## Exemplo tabuada do 2
```py
   extends Node

    func _ready():
        print("Hello world!")
        #print('1')
        #LOOP - repetição
        for x in range(1,11):
            print("2 x ", x , "=", (2*x))


    #OUTRO EXEMPLO

    extends Node

    func _ready():
        print("Hello world!")
        #print('1')
        #LOOP - repetição
        for x in range(0,10):
            print("1 x ", x , "=", (1*x))
        for x in range(0,10):
            print("2 x ", x , "=", (2*x))
        for x in range(0,10):
            print("3 x ", x , "=", (3*x))
        for x in range(0,10):
            print("4 x ", x , "=", (4*x))
```

<br>

## Exemplo tabuada do 1 ao 10
```py
    extends Node

    func _ready():
        print("Hello world!")
        #print('1')
        #LOOP - repetição
        for y in range(1,11):
            for x in range(1,11):
                print(y," x ", x , "=", (y*x))
            print("--------------------")
```

<br>

### A regra da programação: "Se é simples é complicado e se é complicado é simples"