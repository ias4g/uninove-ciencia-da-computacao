#include <stdio.h>

void bolha(int *v, int tam)
{
  int aux, troca;
  int j = tam - 1;
  int i;

  do
  {
    troca = 0;
    for (i = 0; i < j; i++)
      if (v[i] > v[i + 1])
      {
        aux = v[i];
        v[i] = v[i + 1];
        v[i + 1] = aux;
        troca = 1;
      }
    j--;
  } while (troca);
}

int main(int argc)
{
  int v[] = {10, 2, 67, 34, 1};

  bolha(v, 5);
  return 0;
}
