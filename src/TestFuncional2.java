import java.util.ArrayList;
import java.util.Comparator;

public class TestFuncional2 {
    public static void main(String[] args) {
        Alumno a1=new Alumno("Rebrindanard",40,"01123");
        Alumno a2=new Alumno("José",39,"01544");
        Alumno a3=new Alumno("Fidencio",26,"011495");
        Alumno a4=new Alumno("Mayra",27,"011987");

        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);

        //alumnos.stream().forEach(a->System.out.println(a));
        /*ordenamiento*/
        alumnos.stream()
                .sorted(Comparator.comparing(alumno -> alumno.Nombre))
                .forEach(a->System.out.println(a));
        /*reduce: reducir la colección a un solo valor*/
        int suma=alumnos.stream()
                .map(alumno -> alumno.edad)
                .reduce(0,(a,b)->a+b);
        System.out.println(suma);
        /*maxima edad*/
        alumnos.stream().max(Comparator
                .comparing(alumno -> alumno.edad))
                .ifPresent(alumno -> System.out.println(alumno));
        /*ordenar los alumnos en base a las matriculas*/
        /*ordenar los alumnos en base a la edad*/
        /*encontrar el promedio de las edades*/
        /*encontrar el nombre mas largo*/
        /*encontrar el nombre mas corto*/
    }
}
