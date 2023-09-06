import java.util.Arrays;
import java.util.Random;

public class PruebaReferencias {
    public static void main(String[] args) {
        int[] arrA=new int[5];
        Random r= new Random();
        for(int i=0;i<arrA.length;i++){
            arrA[i]=r.nextInt(100);
        }
        System.out.println(Arrays.toString(arrA));
//        int [] arrB=arrA;
        int[] arrB=arrA.clone();
        arrB[0]=7;
        System.out.println(Arrays.toString(arrA));
//        System.out.println(Arrays.toString(arrB));
    }
}
