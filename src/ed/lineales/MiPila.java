package ed.lineales;

public class MiPila<T> extends ListaDoble<T>{
    public void push(T el){
        insertarFinal(el);
    }
    public T pop(){
        return eliminarFinal();
    }
    public T peek(){
        return last.info;
    }
    public static void main(String[] args) {
        MiPila<Integer> pilaEnteros=new MiPila<>();
        pilaEnteros.push(5);
        pilaEnteros.push(15);
        pilaEnteros.push(8);
        pilaEnteros.push(7);
        pilaEnteros.push(3);
        pilaEnteros.push(1);
        pilaEnteros.push(12);
        pilaEnteros.imprimir();
        System.out.println(pilaEnteros.pop());
        System.out.println(pilaEnteros.pop());
        System.out.println(pilaEnteros.pop());
        pilaEnteros.imprimir();
        System.out.println(pilaEnteros.peek());
    }
}
