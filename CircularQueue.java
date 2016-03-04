
/**
 * Implementação da interface ICircularQueue
 *
 */
public class CircularQueue implements ICircularQueue{
	private Integer[] vetor;
	private int contador;
	private int capacidade;
	private int cabeca;//head
	private int calda;//tail
	private int ultimo;
  
	public void create(int capacity){
		vetor = new Integer[capacity];
		capacidade = capacity;
	}

	//quando a quantidade de elementos
	//na fila for igual a sua capacidade
	//a fila está cheia
  public boolean isFull(){
  	return contador == capacidade;
  }

  //se a quantidade efetiva de elementos
  //na fila for igual a 0, a fila está 
  //vazia
  public boolean isEmpty(){
  	return contador == 0;
  }

  //o incremento aqui corresponde ao
  //algorimot criado na seção de fila circular
  //do material, logo...
  public int incIndex(int i){
  	int n = capacidade;
  	if (i == n - 1) return 0;
  	else return i+1;
  }

  //antes precisa-se verificar se a fila 
  //está cheia
  //se não estiver cheia
  //adicionamos e atualizamos as informações
  //de referencia das posicoes de primeiro
  //e ultimo da fila,
  //mas onde entra na fila? em tail()
  public void enqueue(Integer e){
  	if (isFull()) return;
  	else {
  		ultimo = tail();//esse daqui será o valor do último elemento, pois é aqui que ele entra
  		vetor[ultimo] = e;
  		//atualizar o ponto de entrada e
  		//a quantidade de elementos efetivos na fila
  		calda = incIndex(ultimo);//aqui será o ponto onde o próximo elemento entrara
  		contador++;
  	}
  }

  //antes é necessário se há elementos para 
  //remover da fila
  public void dequeue(){
  	if (isEmpty()) return;
  	else {
  		int i = head();//recebe o ponto de remocao
  		vetor[i] = null;
  		//atualiza o ponto de remoção (saída) e
  		//a quantidade de elementos efetivos na fila
  		cabeca = incIndex(i);
  		contador--;
  	}
  }

  //basta recuperar o valor do contador
  public int count(){
  	return contador;
  }

  //basta apresentar o valor da cabeça
  public int head(){
  	return cabeca;
  }

  //basta apresentar o valor da calda
  public int tail(){
  	return calda;
  }

  //aqui, basta verificar qual é a o valor da cabeça
  public int begin(){
  	return head();
  }

  //aqui já precisamos de um controle, logo
  //de uma variável para faciliar a obtenção da informação
  public int end(){
  	return ultimo;
  }

  //vamos criar uma apresentacao com as informações
  //interessantes para a fila circular
  //os elementos e as posicoes de cabeca e calda
  public void show(){
  	for(int i = 0; i < capacidade; i++){
  		if (vetor[i] == null) System.out.print("XX");
  		else {
  			System.out.print(vetor[i]);
  		}
  		System.out.print(" ");
  	}
  	//agora as informações referentes as posicoes
  	//System.out.print(head() + " " + tail());
  	System.out.print(begin() + " " + end());
  	System.out.println("");
  }


}