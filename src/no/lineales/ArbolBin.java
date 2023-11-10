package no.lineales;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ArbolBin <T extends Comparable<T>>{
    BTNodo<T> root;
    ArrayList<T> data;
    public ArbolBin(){
        root=null;
    }
    public boolean vacio(){
        return root==null;
    }
    public void visitar(BTNodo nodo){
        System.out.print(" "+nodo.key);
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

    /*TODO:
    * hacer la programación para encontrar el MAX y el MIN
    * dentro del árbol
    * */

    public void eliminar(T el){
        BTNodo<T> tmp,p=root,node,prev=null;
        while(p!=null && p.key!=el){ //encontrar el elemento
            prev=p;
            if(p.key.compareTo(el)<0)//el es mayor
                p=p.right;// busca a la derecha
            else
                p=p.left;// es menor busca a la izquierda
        }// fin while encontrar el elemento
        node=p;
        if(p!=null && p.key.compareTo(el)==0){//si encontró el
            if(node.right==null) //solo rama izquierda
                node=node.left;
            else if (node.left==null) //solo rama derecha
                node=node.right;
            else{ //tiene 2 ramas
                tmp=node.left;
                while(tmp.right!=null){//encontrar el hijo extremo derecho de la rama izq
                    tmp=tmp.right;
                }//fin while der
                tmp.right=node.right;
                node=node.left;
            }
            if(p==root)
                root=node;
            else if (prev.left==p) {
                prev.left=node;
            }else prev.right=node;

        } else if (root!=null) { //no lo encuentra pero hay árbol
            System.out.println("el elemento "+el+" no se encuentra");
        }else
            System.out.println("el arbol está vacio");// árbol vacío

    }

/*negativo: segundo  mayor al primero
* positivo: primero mayor al segundo
* 0 iguales
* */
    public void recAnchura(){
        BTNodo<T> tmp=null;
        Queue<BTNodo> cola=new LinkedList<>();
        if(root!=null){//hay algo en arbol
            cola.add(root);
            while (!cola.isEmpty()){
                tmp=cola.poll();
                visitar(tmp);
                if(tmp.left!=null)
                    cola.add(tmp.left);
                if(tmp.right!=null)
                    cola.add(tmp.right);
            }
        }
    }
    public void preorden(BTNodo<T> tmp){
        if(tmp!=null){
            visitar(tmp);
            preorden(tmp.left);
            preorden(tmp.right);
        }
    }
    public void inorden(BTNodo<T> tmp){
        if(tmp!=null){
            inorden(tmp.left);
            visitar(tmp);
            inorden(tmp.right);
        }
    }

    public void dataInorden(BTNodo<T> tmp){
        if(tmp!=null){
            dataInorden(tmp.left);
            data.add(tmp.key);
            dataInorden(tmp.right);
        }
    }
    public void posorden(BTNodo<T> tmp){
        if(tmp!=null){
            posorden(tmp.left);
            posorden(tmp.right);
            visitar(tmp);
        }
    }

    public void equilibrar(){
        data=new ArrayList<>();
        dataInorden(root);
        root=null;
        balance(0,data.size()-1);
    }
    public void balance(int first,int last){
        if(first<=last){//sale
            int mid=(last+first)/2;
            insertar(data.get(mid));//insertamos data
            balance(first,mid-1);
            balance(mid+1,last);
        }
    }

    public static void main(String[] args) {
        ArbolBin<String> arbol=new ArbolBin<>();
/*
        arbol.insertar("BART");
        arbol.insertar("HOMERO");
        arbol.insertar("CHOMBO");
        arbol.insertar("ALBERTO");
        arbol.insertar("MARGE");
        arbol.insertar("LISA");
//        arbol.recAnchura();
//        arbol.preorden(arbol.root);
//        System.out.println();
        arbol.eliminar("BART");
        arbol.inorden(arbol.root);
        System.out.println();
//        arbol.posorden(arbol.root);
//        System.out.println();*/
    //probando con el árbol desequilibrado
        arbol.insertar("B");
        arbol.insertar("D");
        arbol.insertar("K");
        arbol.insertar("M");
        arbol.insertar("P");
        arbol.insertar("R");
        arbol.equilibrar();
        System.out.println();

    }


}
