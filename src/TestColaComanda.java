public class TestColaComanda {
    public static void main(String[] args) {
        ColaComanda comandas=new ColaComanda(10);
        System.out.println(comandas.size());
        System.out.println(comandas.isEmpty());
        //cargar comandas
        comandas.enqueue(new Comanda(10,"enchiladas suizas"));
        comandas.enqueue(new Comanda(11,"Taquitos al pastor"));
        comandas.enqueue(new Comanda(12,"Pozole rojo"));

        System.out.println(comandas.isEmpty());
        System.out.println(comandas.dequeue());
        System.out.println(comandas.size());
        System.out.println(comandas.dequeue());
    }
}
