import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UsoQueue {
    public static void main(String[] args) {
        Queue<Comanda> comandas=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el pedido");
        String pedido=s.nextLine();
        comandas.add(new Comanda(123,pedido));
        comandas.add(new Comanda(124,"Tacos al pastor"));
        comandas.add(new Comanda(125,"Torta ahogada"));
        System.out.println(comandas.size());
        System.out.println(comandas.isEmpty());
        //System.out.println("peek:"+comandas.peek());
        System.out.println("poll:"+comandas.poll());
        for (Comanda comanda:comandas) {
            System.out.println(comanda);
        }
        System.out.println(comandas.toString());
    }
}
