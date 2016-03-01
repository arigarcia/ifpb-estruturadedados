//carregar funções
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]){
	//
	int *pint, *pint2;//ponteiro de inteiros
	int sint = sizeof (int);//4 bytes
	//alocar memória para o ponteiro
	pint = (int *) malloc(2 * sint);//2 posições + NULL
	pint2 = (int *) malloc(1 * sint);//1 posição + NULL
	// receber o primeiro valor
	*pint = 10;
	// reposicionar para o próximo elemento
	// mover 4 bytes para alocar o novo elemento
	pint = pint + 1;
	//alocar o novo elemento
	*pint = 20;
	// reposicionar para o próximo elemento movendo mais 3 posições
	// para alocar o novo elemento fora do espaço alocado para pint
	pint = pint + 3;
	//alocar o novo elemento
	*pint = 30;
	//voltar o ponteiro para o primeiro ponto
	pint = pint - 4; 
	//imprimir o resultado
	printf(" Diferença na posição de memória de pint e pint2: %ld \n", (pint2-pint));
	printf(" Tamanho do tipo inteiro: %d bytes\n", sint);
	printf(" Primeiro valor %d, segundo valor %d e terceiro valor %d\n", pint[0], pint[1], pint2[0]);
	//
	free(pint); free(pint2); pint=NULL; pint2=NULL;
	//
	return 0;
}

//Resultado esperado no console
//>> Diferença na posição de memória de pint e pint2: 4 
//>> Tamanho do tipo inteiro: 4 bytes
//>> Primeiro valor 10, segundo valor 20 e terceiro valor 30