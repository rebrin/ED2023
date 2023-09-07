import java.util.Hashtable;
import java.util.Scanner;

public class CuentaLetrasHash {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("introduce un mensaje");
        String mensaje=s.nextLine();
        Hashtable<Character,Integer> tabla=new Hashtable<>();
        for (Character c:mensaje.toCharArray()) {
            if(tabla.containsKey(c)){
                int cuenta=tabla.get(c);
                tabla.put(c,++cuenta);
            }else{
                tabla.put(c,1);
            }
        }
        System.out.println(tabla.toString());
    }

}
