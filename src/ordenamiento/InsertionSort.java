package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    int[] data;
    public InsertionSort(int n){
        Random r=new Random();
        data=new int[n];
        for(int i=0;i<n;i++)
            data[i]=r.nextInt(n*10);
        System.out.println(Arrays.toString(data));
        insertsort();
        System.out.println(Arrays.toString(data));
    }
    public void insertsort(){
        for (int i = 1; i < data.length; i++) {
            int element=data[i];
            int j=i;
            while (j>0 && data[j-1]>element){
                data[j]=data[j-1];
                j--;
            }
            data[j]=element;
        }
    }

    public static void main(String[] args) {
        new InsertionSort(10);
    }
}
