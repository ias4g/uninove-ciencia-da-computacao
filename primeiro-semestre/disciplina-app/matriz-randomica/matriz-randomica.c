#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <locale.h>

#define MATRIZ_L 4
#define MATRIZ_C 4

int main()
{
    system("color A");
    setlocale(LC_ALL, "Portuguese");

    int i;
    int j;
    int m[MATRIZ_L][MATRIZ_C];

    srand(time(NULL));

    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            m[i][j] = rand() % 20;
        }
    }

    printf("Matriz com numeros aleatorios\n\n");
    printf("-------------------------------------\n");
    for (i = 0; i < MATRIZ_L; i++)
    {
        for (j = 0; j < MATRIZ_C; j++)
        {
            printf("%4d", m[i][j]);
        }
        printf("\n");
    }
    printf("-------------------------------------\n");

    system("pause");
    return 0;
}