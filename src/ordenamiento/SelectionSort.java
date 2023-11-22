package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    int[] data;
    public SelectionSort(int n){
        Random r=new Random();
        data=new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i]=r.nextInt(n*10);
        }
        System.out.println(Arrays.toString(data));
        selSort();
        System.out.println(Arrays.toString(data));
    }
    public void selSort(){
        int i,j,least;
        for ( i = 0; i < data.length-1; i++) {
            for (j = i+1,least=i ;j < data.length; j++) {
                if(data[j]<data[least]){
                    least=j;
                }
            }
            if(i!=least){
                int tmp=data[i];
                data[i]=data[least];
                data[least]=tmp;
            }
        }
    }
    public static void main(String[] args) {
        new SelectionSort(10);
    }
}
