
public class Questao01{

	public static void main(String[] args) {
		//instanciar a fila
		Queue queue = new Queue();
		//criar uma fila com capacidade de 10 elementos
		queue.create(10);
		//realizar as operações
		queue.enqueue(10);
		queue.printAll();
		queue.enqueue(20);
		queue.printAll();
		queue.dequeue();
		queue.printAll();
		queue.enqueue(30);
		queue.printAll();
		queue.dequeue();
		queue.printAll();
		queue.dequeue();
		queue.printAll();
	}

}

