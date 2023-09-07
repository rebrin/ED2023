import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PruebaPila {
    public static void main(String[] args) {
        Stack<Integer> pilaEnteros=new Stack<>();
        pilaEnteros.push(1);
        pilaEnteros.push(2);
        pilaEnteros.push(3);
        pilaEnteros.push(4);
        pilaEnteros.push(5);
        System.out.println(pilaEnteros.toString());
        System.out.println(pilaEnteros.peek());
        System.out.println(pilaEnteros.toString());
        System.out.println(pilaEnteros.contains(5));

        Queue<Integer>colaEntero=new LinkedList<>();
        colaEntero.add(1);
        colaEntero.add(2);
        colaEntero.add(3);
        colaEntero.add(4);
        colaEntero.add(5);
        System.out.println("*********-------");
        System.out.println(colaEntero.toString());
        System.out.println(colaEntero.poll());
        System.out.println(colaEntero.toString());

    }
}
