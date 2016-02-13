
public class Questao303{

	public static void main(String[] args) {
		//saber o tamanho da fila
		int c = Integer.parseInt(args[0]);
		//saber quantos comandos foram enviados
		//lembrando que o primeiro elemento é referente 
		//ao tamanho da fila, logo não é um comando
		//logo a iteração deverá iniciar em 1 (vide linha 19)
		int n = args.length;
		//instanciar a fila
		Queue queue = new Queue();
		//criar uma fila com capacidade de 'c' elementos
		queue.create(c);
		//agora é percorrer os argumentos (comandos) enviados
		//considerando que se for D é para excluir um elemento
		//caso contrário é para incluir
		for (int i = 1; i < n; i++){
			if ("D".equals(args[i])){
				queue.dequeue();
			}
			else {
				int e = Integer.parseInt(args[i]);
				queue.enqueue(e);
			}
		}
		//imprimir o resultado
		queue.printAll();
	}

}

