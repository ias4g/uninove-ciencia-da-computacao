## 1. Ler toda a fita e volta trocando 0 por 1 e 1 por 0
```python
input: '101111'
blank: ' '
start state: right

table:
  right:
    [0, 1]: R
    ' ' : {L: carry}  
  carry:
    1: {write: 0, L}
    0: {write: 1, L}
    ' ': {L: done}
  done:

  ```

---

## 2. troca * por -

```python
input: '*****'
blank: ' '
start state: right

table:
  right:
    "*": {write: "-", R}

```

---

## 3. ler numeros e muda para o numero mais um. (ex: 1 -> 2)

```python
input: '1234567890'
blank: ' '
start state: right

table:
  right:
    [1]: {write: "2", R}
    [2]: {write: "3", R}
    [3]: {write: "4", R}
    [4]: {write: "5", R}
    [5]: {write: "6", R}
    [6]: {write: "7", R}
    [7]: {write: "8", R}
    [8]: {write: "9", R}
    [9]: {write: "0", R}
    [0]: {write: "1", R}

  ```

---

## 4. Ler letras e trocar por *.
input: 'qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLÇZXCVBNM'

```python

input: 'qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLÇZXCVBNM'
blank: ' '
start state: right

table:
  right:
    ['q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','ç','z','x','c','v','b','n','m']: {write: "*", R}
    ['Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Ç','Z','X','C','V','B','N','M']: {write: "*", R}
    
```



















