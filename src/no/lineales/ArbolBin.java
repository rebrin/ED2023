package no.lineales;

import java.util.Comparator;

public class ArbolBin <T extends Comparable<T>>{
    BTNodo<T> root;
    public ArbolBin(){
        root=null;
    }
    public boolean vacio(){
        return root==null;
    }
    public void insertar(T el){
        BTNodo p,prev=null;
        p=root;
        while(p!=null){
            prev=p;
            if(el.compareTo((T) p.key)>0)//p.key es menor que el
                p=p.right;
            else p=p.left;
        }
        if(root==null){// si está vacio y se inserta el primer
            root=new BTNodo<T>(el);
        } else if (el.compareTo((T) prev.key)>0) {
            prev.right=new BTNodo<T>(el);
        }else prev.left=new BTNodo<T>(el);
    }

/*negativo: segundo  mayor al primero
* positivo: primero mayor al segundo
* 0 iguales
* */
    public static void main(String[] args) {
        ArbolBin<String> arbol=new ArbolBin<>();

        arbol.insertar("BARTO");
        arbol.insertar("HOMO");
        arbol.insertar("CHOMBO");
        arbol.insertar("ALBERTO");
        System.out.println();
    }
}
