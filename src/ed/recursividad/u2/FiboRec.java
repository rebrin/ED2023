package ed.recursividad.u2;

import java.util.Scanner;

public class FiboRec {

    public FiboRec(){
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el numero fibonacci a saber");
        long n=s.nextLong();
        for(long i=0;i<n;i++){
            System.out.println("salida:"+fibonacci(i));

        }
    }

    public long fibonacci(long n){
        if(n==1||n==0)
            return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        new FiboRec();
    }
}
