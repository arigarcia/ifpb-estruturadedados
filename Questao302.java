
public class Questao302{

	public static void main(String[] args) {
		//saber quantos argumentos foram enviados
		int n = args.length;
		//instanciar a fila
		Queue queue = new Queue();
		//criar uma fila com capacidade de 'n' elementos
		//uma vez que se todos os comandos forem de inserção
		//atingirão a capacidade máxima da fila
		queue.create(10);
		//agora é percorrer os argumentos (comandos) enviados
		//considerando que se for D é para excluir um elemento
		//caso contrário é para incluir
		for (int i = 0; i < n; i++){
			if ("D".equals(args[i])){
				queue.dequeue();
				queue.printAll();
			}
			else {
				int e = Integer.parseInt(args[i]);
				queue.enqueue(e);
				queue.printAll();
			}
		}
	}

}

