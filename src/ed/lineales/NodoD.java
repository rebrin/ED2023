package ed.lineales;

public class NodoD<T> {
    T info;
    NodoD<T> prev,next;
    public NodoD(T info){
        this(info,null,null);
    }
    public NodoD(T info, NodoD prev,NodoD next){
        this.info=info;
        this.prev=prev;
        this.next=next;
    }
}
