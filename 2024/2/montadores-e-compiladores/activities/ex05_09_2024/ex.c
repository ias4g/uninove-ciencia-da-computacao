#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define MAX_LEN 100

// Função para verificar se o caractere está no alfabeto permitido
bool isValidChar(char c)
{
  char allowed[] = "acproz";
  for (int i = 0; i < strlen(allowed); i++)
  {
    if (c == allowed[i])
    {
      return true;
    }
  }
  return false;
}

// Função para validar o sobrenome
bool isValidSurname(const char *surname)
{
  int i;
  for (i = 0; i < strlen(surname); i++)
  {
    if (!isValidChar(surname[i]))
    {
      return false;
    }
  }
  return true;
}

int main()
{
  char surname[MAX_LEN];

  // Solicita o sobrenome ao usuário
  printf("Digite o sobrenome: ");
  fgets(surname, sizeof(surname), stdin);

  // Remove o caractere de nova linha, se houver
  size_t len = strlen(surname);
  if (len > 0 && surname[len - 1] == '\n')
  {
    surname[len - 1] = '\0';
  }

  // Verifica se o sobrenome é válido
  if (isValidSurname(surname))
  {
    printf("O sobrenome '%s' é válido.\n", surname);
    printf("O tamanho da sentença |z| = %zu\n", strlen(surname));
  }
  else
  {
    printf("O sobrenome '%s' contém caracteres inválidos.\n", surname);
  }

  return 0;
}
