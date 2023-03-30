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

```py
    extends Node

    func moverdireita(posx1):
        if posx1+1 <=9:
            return posx1+1;
        else:
            print("posicao invalida")
            return posx1

    func moveresquerda(posx1):
        if posx1-1 >=1:
            return posx1-1;
        else:
            print("posicao invalida")
            return posx1
        

    func movercima(posy1):
        if posy1 +3 <=9:
            return posy1+3;
        else:
            print("posicao invalida")
            return posy1

    func moverbaixo(posy1):
        if posy1 - 3 >=1:
            return posy1-3;
        else:
            print("posicao invalida")
            return posy1

    func moverdiagonalA(posx1):
    posx1=moverdireita(posx1)
    posx1=moverbaixo(posx1)
    return posx1;


    func moverdiagonalB(posx1):
    posx1=moverdireita(posx1)
    posx1=movercima(posx1)
    return posx1;

    func moverdiagonalC(posx1):
    posx1=moveresquerda(posx1)
    posx1=movercima(posx1)
    return posx1;

    func moverdiagonalD(posx1):
    posx1=moveresquerda(posx1)
    posx1=moverbaixo(posx1)
    return posx1;


    func imprimirpos(pos):
        print("posição:", pos)
        
    func _ready():
        var posx = 5
        imprimirpos(posx)
        posx = moveresquerda(posx)
        imprimirpos(posx)
        posx = moveresquerda(posx)
        imprimirpos(posx)
        posx = moveresquerda(posx)
        imprimirpos(posx)
        posx = moveresquerda(posx)
        imprimirpos(posx)
        posx = moveresquerda(posx)
        imprimirpos(posx)
```

### Condição IF/ELSE

```py
    extends Node

    func _ready():
        #atribuição - colocando valor na variável
        var idade = 25 # cria um espaço em memória para qqr valor
        # perguntando o valor da variável
        # idade ????????
        if idade >=18: #pergunta - CONDIÇÃO
            print("Maior de Idade")
        else:
            print("Menor de Idade")
```

<br>

## TESTE DE LÓGICA - ANDAR EM CASAS VÁLIDAS
TESTE1  - PEDROSO(2023):
```py
        Func linha():
        if posx >=1 or <=3:
            Return 1
        Elif posx >=4 or <=6:
            Return 2
        Else:
    Return 3
    Func linha(posx):
        if posx >=1 or <=3:
            Return 1
        Elif posx >=4 or <=6:
            Return 2
        Else:
    Return 3
```

<br>

TESTE 2
```py
    extends Node

    #MATRIZ
    func teste2(p,a):
        var arr=[p,a]
        var arr2= [p,arr]
        return arr2

    #ARRAY
    func teste(p,a):
        var arr=[p,a]
        return arr

    func _ready():
        print("Hello world!")
        #print(teste(1,2))
        var x=teste(1,2)
        print(x[0])
        print(x[1])
        var y=teste2(1,2)
        for i in y:
            print(i)
```