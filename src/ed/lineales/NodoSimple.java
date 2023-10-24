package ed.lineales;

public class NodoSimple {
    int info;
    NodoSimple next;
    public NodoSimple(int i){
        this(i,null);
    }
    public NodoSimple(int i,NodoSimple n){
        this.info=i;
        this.next=n;
    }

}
