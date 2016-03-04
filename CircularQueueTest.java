


public class CircularQueueTest{

  public static void main(String[] args){
  	//chamar a classe
  	CircularQueue queue = new CircularQueue();
  	//criar a fila
  	queue.create(4);//vamos ver qual o tamanho da fila (4)
  	//percorrer os elementos enviados pelo argumento
  	for (int i = 0; i < args.length; i++){
  		if ("D".equals(args[i])) queue.dequeue();
  		else {
  			int e = Integer.parseInt(args[i]);
  			queue.enqueue(e);
  		}
  		//mostrar a fila depois de cada operação
  		queue.show();
  	}

  }

}