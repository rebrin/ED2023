package ed.recursividad.u2;

import java.util.Scanner;

public class MCDRec {
    public MCDRec(){
        Scanner s=new Scanner(System.in);
        System.out.println("introduce a");
        int a=s.nextInt();
        System.out.println("introduce b");
        int b=s.nextInt();
        System.out.println("mcd:"+mcd(a,b));
    }

    public int mcd(int a,int b){
        if(b==0)
            return a;
        else return mcd(b,a%b);
    }

    public static void main(String[] args) {
        new MCDRec();
    }
}
