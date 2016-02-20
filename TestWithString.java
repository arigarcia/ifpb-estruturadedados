public class TestWithString{
  
  public static void main(String[] args) {
    int n = args.length;
    
    QueueWithString x = new QueueWithString();
    x.create(n+3);
    x.enqueue("fabio");
    x.enqueue("joao");
    x.enqueue("maria");
    
    for (int i = 0; i < n; i++){
      if ("D".equals(args[i])){
        x.dequeue();
      }
          else {

            String e = /*Integer.parseInt(*/args[i]/*)*/;//aqui vc recebe so string
            x.enqueue(e);
          }
        }
        x.printAll();
    }

}