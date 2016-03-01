
//carregar funções de leitura e escrita
#include <stdio.h>
//carregar funções padrões de C
#include <stdlib.h>

int main(int argc, char const *argv[]){
	//
	int *pint;//ponteiro de inteiros
	int sint = sizeof (int);//4 bytes
	//alocar memória para o ponteiro
	pint = (int *)malloc(3 * sint);
	// receber o primeiro valor
	*pint = 5;
	// reposicionar para o próximo elemento
	// mover 4 bytes para alocar o novo elemento
	pint = pint + 1;
	//alocar o novo elemento
	*pint = 7;
	// reposicionar para o próximo elemento
	// mover 4 bytes para alocar o novo elemento
	pint = pint + 1;
	//alocar o novo elemento
	*pint = 9;
	//voltar o ponteiro para o primeiro ponto
	pint = pint - 2; 
	//imprimir o resultado
	printf(" Tamanho do tipo inteiro: %d bytes\n", sint);
	printf(" Primeiro valor %d, segundo valor %d e terceiro valor %d\n", pint[0], pint[1], pint[2]);
	//
	free(pint);
	pint = NULL;
	//
	return 0;
}

//Resultado esperado no console
//>>Tamanho do tipo inteiro: 4 bytes
//>>Primeiro valor 5 e segundo valor 7

