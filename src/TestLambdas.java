import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambdas {
    public static void main(String[] args) {
        Comanda c1=new Comanda(1,"tacos");
        Comanda c2=new Comanda(2,"tortas");
        Comanda c3=new Comanda(3,"tamales");
        Comanda c4=new Comanda(4,"atole");

        ArrayList<Comanda>comandas=new ArrayList<>();
        comandas.add(c1);
        comandas.add(c2);
        comandas.add(c3);
        comandas.add(c4);

        List<Comanda> filtradas=comandas.stream()
                .filter(comanda -> comanda
                        .getPedido()
                        .length()>5)
                .collect(Collectors.toList());
        System.out.println(comandas.toString());
        System.out.println("filtrados:"+filtradas.toString());
    }
}
