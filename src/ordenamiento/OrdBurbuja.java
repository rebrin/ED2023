package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class OrdBurbuja {
    int [] data;
    public OrdBurbuja(int numeros){
        Random r=new Random();//declaro objeto Random
        data=new int[numeros];//pido memoria para los datos
        for(int i=0;i<numeros;i++){
            data[i]=r.nextInt(100);//genera datos aleatorios
        }
        System.out.println(Arrays.toString(data));//imprime arreglo
        burbuja(data);
        System.out.println(Arrays.toString(data));
    }

    public void burbuja(int[] data){
        for (int i=0;i< data.length;i++){
            for (int j=0;j< data.length-1;j++){
                if(data[j]>data[j+1]){
                    //intercambia
                    int tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        new OrdBurbuja(10);
    }
}
