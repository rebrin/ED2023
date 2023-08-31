import java.util.ArrayList;

public class TestAlumno {
    public static void main(String[] args) {
        //Estructura arrays
//        Alumno[] Alumnos=new Alumno[100];
//        Alumnos[0]=new Alumno("rebrin",39,"0007");
//        Alumnos[1]=new Alumno("jose",39,"0008");
//        Alumnos[2]=new Alumno("Fidencio",63,"0009");
//        Alumnos[3]=new Alumno("Rigobreto", 21, "0010");
//        Alumnos[4]=new Alumno("alberto", 11, "0011");
//        Alumnos[10]=new Alumno("pepe", 31, "0012");
//        Alumnos[10]=new Alumno("Rebrindanard", 39, "007");
        //estructura lista enlazada

//        for(int i=0; i< Alumnos.size();i++){
//            if(Alumnos.get(i)!=null)
//            System.out.println(Alumnos.get(i));
//        }
//*******************ArrayList*****************************
        ArrayList<Alumno> Alumnos=new ArrayList<>();
        Alumnos.add(new Alumno("rebrin",39,"0007"));
        Alumnos.add(new Alumno("jose",39,"0008"));
        Alumnos.add(new Alumno("Rigobreto", 21, "0010"));
        for (Alumno Al:Alumnos) {
            System.out.println(Al);
        }
    }
}
