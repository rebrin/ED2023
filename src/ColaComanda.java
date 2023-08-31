public class ColaComanda {
    private Comanda[] data;
    private int head,tail;
    public ColaComanda(int tam){
        data=new Comanda[tam];
        head=tail=0;
    }
    public void enqueue(Comanda comanda){
        data[tail]=comanda;
        tail=(tail+1)% data.length;
    }
    public Comanda dequeue(){
        Comanda value=data[head];
        head=(head+1)% data.length;
        return value;
    }
    public boolean isEmpty(){
        return head==tail;
    }
    public int size(){
        return (tail-head+ data.length)% data.length;
    }

}
