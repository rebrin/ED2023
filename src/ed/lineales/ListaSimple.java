package ed.lineales;

public class ListaSimple {
    NodoSimple First,Last;
    public ListaSimple(){
        First=Last=null;
    }
    public boolean estaVacia(){
        return First==null;
    }
    public void insertarFrente(int n){
        if(estaVacia())
            First=Last=new NodoSimple(n);
        else {
        NodoSimple nvo=new NodoSimple(n,First);
        First=nvo;
        }
    }
    public void insertarFinal(int n){
        if(!estaVacia()){
            Last.next=new NodoSimple(n);
            Last=Last.next;
        }else First=Last=new NodoSimple(n);
    }
    public void printAll(){
        for(NodoSimple tmp=First;tmp!=null;tmp=tmp.next)
            System.out.print(tmp.info+" ");
    }
    public int eliminarFrente(){
        if(!estaVacia()){
            //caso2 solo un elemento
            NodoSimple tmp=First;
            if(First==Last){
                First=Last=null;
            }else { //caso3 mas de un elemento
                First= First.next;
                tmp.next=null;
            }
            return tmp.info;
        }return Integer.MIN_VALUE;
    }
    public int eliminarFinal(){
        if(!estaVacia()){
            NodoSimple tmp=Last;
            if(First==Last){
                First=Last=null;
            }else {//mas de un elemento
                NodoSimple penultimo;
                for(penultimo=First
                    ;penultimo.next!=Last;
                    penultimo=penultimo.next){}
                Last=penultimo;
                Last.next=null;
            }
            return tmp.info;
        }return Integer.MIN_VALUE;
    }
    public boolean enlista(int buscado){
        NodoSimple tmp;
        for(tmp=First; tmp!=null&&tmp.info!=buscado; tmp=tmp.next){}
        return tmp!=null;
    }

    public void eliminar(int n){
        if(!estaVacia()){
            if(First==Last){ //es el único elemento en lista
                First=Last=null;
            }else{
                if(n== First.info)
                    eliminarFrente();
                else if(n== Last.info)
                    eliminarFinal();
                else {
                    NodoSimple pred,tmp;
                    for(pred=First,tmp=First.next;
                    tmp!=null && tmp.info!=n;
                    pred=tmp,tmp=tmp.next
                    );
                    pred.next=tmp.next;
                    tmp.next=null;
                }
            }
        }
    }
    public static void main(String[] args) {
        ListaSimple lista=new ListaSimple();
        lista.insertarFrente(9);
        lista.insertarFrente(5);
        lista.insertarFrente(3);
        lista.insertarFinal(10);
        lista.insertarFinal(11);
        lista.printAll();
        System.out.println();
        System.out.println(lista.enlista(13));
//        System.out.println(lista.eliminarFrente());
//        System.out.println(lista.eliminarFrente());
        //System.out.println(lista.eliminarFinal());
        //System.out.println(lista.eliminarFinal());
        lista.eliminar(10);
        lista.printAll();
    }
}
