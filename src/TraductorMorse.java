import java.util.Hashtable;
import java.util.Scanner;

public class TraductorMorse {
    public static void main(String[] args) {
        Hashtable<String,String>diccionario=new Hashtable<>();
        diccionario.put("A","._");
        diccionario.put("B","_...");
        diccionario.put("C","_._.");
        diccionario.put("D","_..");
        diccionario.put("E",".");
        diccionario.put("F",".._.");
        diccionario.put("G","__.");
        diccionario.put("H","....");
        diccionario.put("I","..");
        diccionario.put("J",".___");
        diccionario.put("K","_._");
        diccionario.put("L","._..");
        diccionario.put("M","__");
        diccionario.put("N","_.");
        diccionario.put("O","___");
        diccionario.put("P",".__.");
        diccionario.put("Q","__._");
        diccionario.put("R","._.");
        diccionario.put("S","...");
        diccionario.put("T","_");
        diccionario.put("U",".._");
        diccionario.put("V","..._");
        diccionario.put("W",".__");
        diccionario.put("X","_.._");
        diccionario.put("Y","_.__");
        diccionario.put("Z","__..");
        diccionario.put(" "," ");
        /*Zona de creación de lectura*/
        Scanner s=new Scanner(System.in);
        System.out.println("introduce la cadena a traducir");
        String cad=s.nextLine();
        cad=cad.toUpperCase();
        for (Character c:cad.toCharArray()) {
            System.out.printf(diccionario.get(String.valueOf(c))+" ");
        }
    }
}
