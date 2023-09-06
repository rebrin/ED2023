import java.util.*;

public class Ejercicio1Comandas {
    Scanner s=new Scanner(System.in);
    Queue<Comanda> comandas=new LinkedList<>();
    int idComanda;
    ArrayList<Integer> opciones=new ArrayList<>(Arrays.asList(1,2,3));
    //constructor de mi clase y punto de partida en main
    Ejercicio1Comandas(){
        int opcion=0;
        idComanda=0;

            do {
                menu();//muestre el menu
                try {
                    opcion = s.nextInt();
                     if (opciones.contains(opcion)) {
                    switch (opcion) {
                        case 1://caso para insertar
                            System.out.println("dame el pedido:");
                            String pedido = s.next();
                            comandas.add(new Comanda(++idComanda, pedido));
                            break;
                        case 2://atender una comanda
                            if (comandas.size() > 1) {
                                System.out.println("el siguiente pedido es:");
                                System.out.println(comandas.poll());
                            } else System.out.println("no hay pedidos por atender");
                            break;
                    }
                } else System.out.println("opción no válida");
                }catch (InputMismatchException e){
                    System.err.println("La entrada que se agrega no es numérica ");
                    s=new Scanner(System.in);
                }
            } while (opcion != 3);

    }
    public void menu(){
        System.out.println("opciones:");
        System.out.println("opción 1:insertar comanda");
        System.out.println("opción 2:atender pedido");
        System.out.println("opción 3: salir");
    }
    public static void main(String[] args) {
        new Ejercicio1Comandas();
    }

}
