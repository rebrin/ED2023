package ed.lineales;

public class ListaDoble<T> {
    NodoD<T> first,last;
    public ListaDoble(){
        first=last=null;
    }

    public boolean vacia(){
        return first==null;
    }
    public void insertarFrente(T info){
        if(vacia()) {//vacia
            NodoD<T> nvo = new NodoD<>(info);
            first=last=nvo;
        }else{
            NodoD<T>nvo=new NodoD<>(info,null,first);
            first.prev=nvo;
            first=nvo;
        }
    }

    public void insertarFinal(T info){
        if(vacia()) {
            NodoD<T> nvo = new NodoD<T>(info);
            first=last=nvo;
        }else{
            NodoD<T> nvo=new NodoD<T>(info,last,null);
            last.next=nvo;
            last=nvo;
        }
    }

    public T eliminarFrente(){
        if(!vacia()){
            NodoD<T> tmp=first;
            if(first==last)
                first=last=null;
            else {
                first=first.next;
                first.prev=null;
                tmp.next=null;
            }
            return tmp.info;
        }
        return null;
    }

    public T eliminarFinal(){
        if(!vacia()){
            NodoD<T> tmp=last;
            if(first==last)//solo hay un elemento
                first=last=null;
            else{ //hay mas de un elemento
                last=last.prev;
                tmp.prev=null;
                last.next=null;
            }
            return tmp.info;
        }return null;
    }
    public boolean busca(T buscado){
        NodoD<T> tmp;
        for(tmp=first;
                 tmp!=null && tmp.info!=buscado
                ;tmp=tmp.next){}
        return tmp!=null;
    }

    /*todo: implementar el remove de cualquier parte
    *  no regresa valores, solo elimina de la lista*/

    public void imprimir(){
        System.out.println();
        for(NodoD<T> tmp=first;tmp!=null;tmp=tmp.next){
            System.out.print(tmp.info+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaDoble<Integer> listaDoble=new ListaDoble();
        listaDoble.insertarFrente(3);
        listaDoble.insertarFrente(5);
        listaDoble.insertarFrente(7);
        listaDoble.imprimir();
        listaDoble.insertarFinal(13);
        listaDoble.insertarFinal(17);
        listaDoble.insertarFinal(19);
        listaDoble.imprimir();
//        System.out.println(listaDoble.eliminarFrente());
//        System.out.println(listaDoble.eliminarFrente());
//        listaDoble.imprimir();
//        System.out.println(listaDoble.eliminarFinal());
//        System.out.println(listaDoble.eliminarFinal());
//        listaDoble.imprimir();

        System.out.println(listaDoble.busca(17));
        System.out.println(listaDoble.busca(19));
        System.out.println(listaDoble.busca(2));
        System.out.println(listaDoble.busca(5));
    }
}
