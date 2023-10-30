package ed.lineales;

public class MiQueue<T> extends ListaDoble<T> {
    /*todo: queue*/
    public void formar(T el){
        insertarFinal(el);
    }
    /*todo: enqueue*/
    public T atender(){
        return eliminarFrente();
    }
    /*todo: peek*/
    public T proximo(){
        return first.info;
    }
    public static void main(String[] args) {
     MiQueue<Integer> cola=new MiQueue();
     cola.formar(5);
     cola.formar(1);
     cola.formar(12);
     cola.formar(7);
     cola.formar(6);
     cola.formar(5);
     cola.formar(3);
     cola.formar(2);
     cola.imprimir();
     System.out.println(cola.atender());
     System.out.println(cola.atender());
     System.out.println(cola.atender());
        cola.imprimir();
        System.out.println(cola.proximo());
        cola.imprimir();
    }
}
