package no.lineales;

import java.util.ArrayList;

public class NodoG {
    NodoG Parent;
    ArrayList<NodoG>listAdya;
    String nombre;
    public NodoG(String n){
        nombre=n;
        listAdya=new ArrayList<>();
        Parent=null;
    }
}
