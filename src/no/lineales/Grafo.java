package no.lineales;

import java.util.ArrayList;

public class Grafo {
    ArrayList<NodoG> Frontera;
    ArrayList<NodoG> Explorados;

    public Grafo() {
        Frontera = new ArrayList<>();
        Explorados = new ArrayList<>();
    }

    public void conecta(NodoG n1, NodoG n2) {
        if (!n1.listAdya.contains(n2))
            n1.listAdya.add(n2);
        if (!n2.listAdya.contains(n1))
            n2.listAdya.add(n1);
    }

    public boolean graphSearch(NodoG inicial, NodoG sol) {
        Frontera.add(inicial);
        Explorados.clear();//borra explorados
        while (true) {
            if (Frontera.isEmpty())
                return false;//regresa fallo
            NodoG S = Frontera.remove(0);//regresa el 1er elem
            if (S.nombre == sol.nombre) {
                //regreso el camino hasta el inicial
                System.out.println(path(S));
                return true;
            }
            Explorados.add(S);
            S.listAdya.forEach(hijo -> {
                if (!Frontera.contains(hijo)
                        && !Explorados.contains(hijo)){
                    Frontera.add(hijo);
                    hijo.Parent = S;
                }
            });
        }
    }
    //método para imprimir el camino hacia al padre
    public String path(NodoG destino){
        String cam="";
        NodoG tmp=destino;
        while (tmp!=null){
            cam=tmp.nombre+" "+cam;
            tmp=tmp.Parent;
        }
        return cam;
    }
    public static void main(String[] args) {
        Grafo g = new Grafo();
        //creación de los nodos
        NodoG NodoDesc=new NodoG("desconectado");
        NodoG Ahuiran = new NodoG("Ahuiran");
        NodoG Paracho = new NodoG("Paracho");
        NodoG Aranza = new NodoG("Aranza");
        NodoG Cheranastico = new NodoG("Cheranastico");
        NodoG Cheran = new NodoG("Cheran");
        NodoG Nahuatzen = new NodoG("Nahuatzen");
        NodoG Arantepacua = new NodoG("Arantepacua");
        NodoG Quinceo = new NodoG("Quinceo");
        //conexión de los nodos
        g.conecta(Ahuiran, Paracho);
        g.conecta(Paracho, Aranza);
        g.conecta(Aranza, Cheranastico);
        g.conecta(Aranza, Cheran);
        g.conecta(Cheran, Nahuatzen);
        g.conecta(Nahuatzen, Arantepacua);
        g.conecta(Arantepacua, Quinceo);
        g.conecta(Quinceo, Paracho);
        // llamada a busqueda
        System.out.println(g.graphSearch(Ahuiran, NodoDesc));
    }
}
