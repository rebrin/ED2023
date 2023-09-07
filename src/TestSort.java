import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Comanda> comandas=new ArrayList<>();
        comandas.add(new Comanda(3,"tacos"));
        comandas.add(new Comanda(1,"tortas"));
        comandas.add(new Comanda(2,"tamales"));
        comandas.add(new Comanda(4,"atole"));

        System.out.println(comandas.toString());
        Collections.sort(comandas, new Comparator<Comanda>() {
            @Override
            public int compare(Comanda o1, Comanda o2) {
                return o1.getPedido().compareTo(o2.getPedido());
            }
        });
        System.out.println(comandas.toString());

    }
}
