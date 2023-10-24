package ed.lineales;

public class ListaCirc {
    NodoSimple inicio,fin;
    ListaCirc(){
        inicio=fin=null;
    }
    public boolean vacia(){
        return inicio==null && fin==null;
    }
    public void insertarFrente(int n){
        NodoSimple nvo=new NodoSimple(n);
        if(vacia()){
            inicio=fin=nvo;}
        else{
            nvo.next=inicio;}
        inicio=nvo;
        fin.next=inicio;
    }
    public void imprime(){
        System.out.println();
        if(vacia())
            return;
        else{
            //imprimir el primer elemento
            System.out.print(inicio.info+" ");
            for(NodoSimple tmp=inicio.next;
                tmp!=inicio;
                tmp=tmp.next
            ){
                System.out.print(tmp.info+" ");
            }
            System.out.println();
        }
    }
    public void insertarFinal(int n){
        NodoSimple nvo=new NodoSimple(n);
        if(vacia())
            inicio=nvo;
        else
            fin.next=nvo;
        fin=nvo;
        fin.next=inicio;
    }

    public boolean contiene(int el){
        NodoSimple tmp;
        for(
          tmp=inicio;
          el!=tmp.info && tmp.next!=inicio;
          tmp=tmp.next
        );
        return el==tmp.info;
    }
    /* todo: realizar el método buscar que muestre
    *   la primera aparición del elemento en la lista*/

    public static void main(String[] args) {
        ListaCirc circ=new ListaCirc();
        circ.insertarFrente(1);
        circ.insertarFrente(2);
        circ.insertarFrente(3);
        circ.insertarFrente(4);
        circ.imprime();
        circ.insertarFinal(5);
        circ.insertarFinal(6);
        circ.insertarFinal(7);
        circ.imprime();
        System.out.println(circ.contiene(7));
    }
}
