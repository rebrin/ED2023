import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio1Comandas {
    Scanner s=new Scanner(System.in);
    Queue<Comanda> comandas=new LinkedList<>();
    int idComanda;
    //constructor de mi clase y punto de partida en main
    Ejercicio1Comandas(){
        int opcion=0;
        idComanda=0;
        do{
            menu();//muestre el menu
            opcion=s.nextInt();
            if(opcion==1 || opcion==2 ||opcion==3){
            switch (opcion){
                case 1://caso para insertar
                    System.out.println("dame el pedido:");
                    String pedido=s.next();
                    comandas.add(new Comanda(++idComanda,pedido));
                    break;
                case 2://atender una comanda
                    System.out.println("el siguiente pedido es:");
                    System.out.println(comandas.poll());
                    break;
            }}
            else System.out.println("opción no válida");
        }while(opcion!=3);
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
