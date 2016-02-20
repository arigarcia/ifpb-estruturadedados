/**
 * Implementação do Contrato de uma fila
 *
 */
public class QueueWithString implements IQueueWithString {
  //variável de controle de organização
  private boolean dequeued = false;
  //variável para armazenar a capacidade da fila
  private int capacity = 0;
  //variável para armazenar a quantidade de elementos na fila
  private int count = 0;
  //variável da posição do último elemento (inicialmente -1)
  private int i_last = -1;
  //definindo o vetor de string
  private String[] vetor;


	//operação de criar uma fila
  public void create(int capacity){
    //instanciando o vetor
    vetor = new String[capacity];
  }

	//operação de organização da fila 
  //depois de uma exclusão
  public void organize(){
    //verificar se foi excluido elementos
    if (!dequeued) return;
    //iniciar a organização
    for (int i = 0; i < count; i++){
      vetor[i] = vetor[i+1];
      vetor[i+1] = null;
    }
    //atualizar a posição do último elemento
    i_last = count - 1;
    //atualizar a variável de controle
    dequeued = false;
  }

	//definindo a capacidade do vetor 
  public void enqueue(String element){
    //verifica se a fila está cheia
    if (isFull()){
      return;//sai da operação imediatamente
    }
    //definir a posicao de entrada
    int i_new;
    if (isEmpty()){
      i_new = 0;
    }
    else {
      i_new = i_last + 1;  
    }
    //incluir o novo elemento
    vetor[i_new] = element;
    //incrementar a quantidade de elementos na fila
    count = count + 1;
    //atualizar a posição do último elemento
    i_last = i_new;
  }
	
	//excluir um elemento da fila
  public void dequeue(){
    //verificar se a fila é vazia
    if (isEmpty()) return;
    //excluir um elemento
    vetor[0] = null;
    //atualizar a contagem
    count = count - 1;
    //organizar os elementos
    dequeued = true;
    organize();
  }

	//imprimir a fila atual
	public void printAll(){
		for (int i = 0; i < count; i++){
			System.out.print(vetor[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	
	//verifica se a fila está vazia
  public boolean isEmpty(){
    return (count == 0);
  }

	//verifica se a fila está cheia
  public boolean isFull(){
    return (!isEmpty()) && (count == capacity);
  }

	//verifica quantos elementos 
  //estão efetivamente na fila
  public int count(){
    return count;
  }

}