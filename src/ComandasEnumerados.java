import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

enum Opciones{
    INSERTAR,
    ELIMINAR,
    MODIFICAR,
    MOSTRAR,
    SALIR
}
public class ComandasEnumerados {
    ArrayList<Comanda> comandas;
    Scanner s;
    int id;
    public ComandasEnumerados() {
        comandas=new ArrayList<>();
        s=new Scanner(System.in);
        int leida=0;
        id=0;
        do{
            menu();
            try{
            leida=s.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("suponemos que quieres insertar");
                leida=1;
                s=new Scanner(System.in);
            }
            switch (leida){
                case 1:
                    String pedido;
                    System.out.println("inserta el pedido");
                    pedido=s.next();
                    comandas.add(new Comanda(++id,pedido));
                    System.out.println("pedido insertado");
                    break;
                case 2:
                    int iEliminar=0;
                    System.out.println("introduce el id a eliminar");
                    iEliminar=s.nextInt();
                    int i=0;
                    for (Comanda c:comandas) {
                        if(iEliminar==c.getId()){
                            break;
                        }
                        i++;
                    }
                    if(comandas.size()<i){
                        comandas.remove(i);
                        System.out.println("eliminado..");
                    }else System.out.println("no existe el id");
                    break;
                case 3:
                    System.out.println("id a modificar");
                    int iModificar=0;
                    System.out.println("introduce el id a eliminar");
                    iModificar=s.nextInt();
                    i=0;
                    for (Comanda c:comandas) {
                        if(iModificar==c.getId()){
                            break;
                        }
                        i++;
                    }
                    Comanda modificada=comandas.get(i);
                    System.out.println("nuevo pedido");
                    String pedidoNuevo=s.next();
                    modificada.setPedido(pedidoNuevo);
                    System.out.println("modificado..");
                    break;
                case 4:
                    System.out.println("mostrar");
                    System.out.println(comandas.toString());
                    break;
            }

        }while (leida!=5);
    }

    public void menu(){
        System.out.println("Opciones:");
        System.out.println("1:insertar");
        System.out.println("2:eliminar");
        System.out.println("3:modificar");
        System.out.println("4:mostrar");
        System.out.println("5:salir");
    }
    public static void main(String[] args) {
    new ComandasEnumerados();
    }
}
