import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class PruebaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> ColleccionEnteros;
        ColleccionEnteros=new ArrayList<>();
        Random r=new Random();
        ColleccionEnteros.add(3);
        for (int i = 1; i < 10; i++) {
            ColleccionEnteros.add(r.nextInt(100));
        }
        System.out.println(ColleccionEnteros.toString());

//        for(Integer el:ColleccionEnteros){
//            if(el==3)
//                ColleccionEnteros.remove(el);
//        }
        Iterator<Integer> it=ColleccionEnteros.iterator();
        while (it.hasNext()){
            Integer el=it.next();
            if(el==3){
                it.remove();
            }
        }
        System.out.println(ColleccionEnteros.toString());
    }
}
