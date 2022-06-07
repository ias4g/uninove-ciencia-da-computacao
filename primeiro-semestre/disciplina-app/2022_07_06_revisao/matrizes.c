#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>

int main()
{
    system("color A");

    int x = 25;
    int y = 5;
    int z = 0;

    for (z = 0; x >= y; x = x - y, z++)
        ;
    printf("x=%2d, y=%2d, z=%2d\n", x, y, z);
}