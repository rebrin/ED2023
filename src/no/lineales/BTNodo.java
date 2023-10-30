package no.lineales;

public class BTNodo <T extends Comparable<T>>{
    public T key;
    BTNodo<T> left,right;
    public BTNodo(){
        left=right=null;
    }
    public BTNodo(T el){
        this(el,null,null);
    }
    public BTNodo(T el,BTNodo l,BTNodo r){
        key=el;
        left=l;
        right=r;
    }

}
