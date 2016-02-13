/**
 * Contrato de uma fila
 *
 */
public interface IQueue{
	//operação de criar uma fila
	void create(int capacity);
	//operação de organização da fila 
	//depois de uma exclusão
	void organize();
	//inclui um elemento na fila
	void enqueue(int element);
	//excluir um elemento da fila
	void dequeue();
	//imprimir a fila atual
	void printAll();
	//verifica se a fila está vazia
	boolean isEmpty();
	//verifica se a fila está cheia
	boolean isFull();
	//verifica quantos elementos 
	//estão efetivamente na fila
	int count();
}