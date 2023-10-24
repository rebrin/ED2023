package ed.recursividad.u2;

import java.util.Scanner;

public class TrianguloPascal {
    public TrianguloPascal(){
        Scanner s=new Scanner(System.in);
        System.out.println("numero de filas");
        int filas=s.nextInt();
        for(int i=0;i<filas;i++){
            for (int j=0;j<=i;j++) {
                System.out.print(triang(i, j)+" ");
            }
        System.out.println();}
    }

    public int triang(int fila,int columna){
        //caso base
        if(columna==0||fila==columna)
            return 1;
        else return triang(fila-1,columna-1)
                +triang(fila-1,columna);
    }

    public static void main(String[] args) {
        new TrianguloPascal();
    }
}
