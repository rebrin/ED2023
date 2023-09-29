package ed.recursividad.u2;

import java.util.Scanner;
/*potencia recursiva para numeros de potencia mayores a 0*/
public class PotenciaRec {
    public PotenciaRec(){
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el numero");
        int n=s.nextInt();
        System.out.println("introduce la potencia");
        int pot=s.nextInt();
        if ((pot >= 0)) {
            System.out.println(potencia(n, pot));
        } else {
            System.out.println("error potencia negativa");
        }
    }

    public int potencia(int n, int p){
        if(p==0)
            return 1;
        if(p==1)
            return n;
        else return n*potencia(n,p-1);
    }
    public static void main(String[] args) {
        new PotenciaRec();
    }
}
