

/**
 * Interface que representa as ações de
 * uma fila circular.
 * Algumas coisas não mudam com relação a fila
 * com reoganização após a remoção.
 */
public interface ICircularQueue{

	//criar uma fila com capacidade limitada
	//e estaticamente definida
	void create(int capcity);

	//verificar se a fila está cheia
  boolean isFull();

  //verificar se a fila está vazia
  boolean isEmpty();

  //calcular o incremento do ponto
  //de entrada ou saída (novo)
  int incIndex(int index);

  //entrar na fila
  void enqueue(Integer e);

  //sair da fila
  void dequeue();

  //quantidade de elementos efetivos na fila
  int count();

  //posição de saída da fila
  int head();

  //posição de entrada na fila
  int tail();

  //valor iniciar da fila (posição inicial - do primeiro)
  int begin();

  //valor final da fila (posição do último elemento)
  int end();

  //apresentar o resultado da fila atual
  void show();

}