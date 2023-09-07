import java.util.Hashtable;

public class ControlEscolarBasico {
    public static void main(String[] args) {
        /*
        * tabla hash que usa como clave la matricula del alumno
        * */
        Hashtable<String,Alumno> control=new Hashtable<>();
        Alumno a1=new Alumno("rebrindanard",39,"123");
        Alumno a2=new Alumno("mayra",36,"124");
        Alumno a3=new Alumno("jose",23,"125");

        control.put(a1.Matricula, a1);
        control.put(a2.Matricula, a2);
        control.put(a3.Matricula, a3);
        //control.remove("123"); //eliminar una llave
        //obtener un alumno
        Alumno ref=control.get("125");
        ref.Nombre="JOSÉ";
        System.out.println(control.toString());
        //mostrar cada elemento
        for (Alumno a:control.values()){
            System.out.println(a);
        }

    }
}
