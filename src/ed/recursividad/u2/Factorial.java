package ed.recursividad.u2;

import java.util.Scanner;

public class Factorial {
    /*constructor*/
    public Factorial(){
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el número N:");
        long n=s.nextLong();
   //     System.out.println(factRec(n));
        for (int i=1;i<15;i++){
            System.out.println();
        }
    }

    public long factRec(long n){
        //caso base 0! y 1! ==>1
        if(n==1 || n==0)
            return 1;
        else return n*factRec(n-1);
    }


    public static void main(String[] args) {
        new Factorial();
    }
}
