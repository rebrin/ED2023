import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFiles {
    public static void main(String[] args) {
        try {
            Stream<String> alumnos = Files.
                    lines(Paths.get("./src/alumnos.csv"));

            List<Alumno>listaAlumnos=alumnos
                    .map(linea->linea.split(","))
                    .map(arr->new Alumno(arr[0], Integer.parseInt(arr[1]),arr[2]))
                    .collect(Collectors.toList());

            System.out.println(listaAlumnos.toString());
listaAlumnos.add(new Alumno("salvador",64,"46132"));
            System.out.println(listaAlumnos.toString());


//        String cad="rebrin,40,5462132";
//        String[] res=cad.split(",");
//            System.out.println(res.length);
//            System.out.println(res[0]);
//            System.out.println(res[1]);
//            System.out.println(res[2]);
        }catch (Exception e){
            System.err.println("error:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
