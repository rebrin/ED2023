public class Alumno {
String Nombre;
int edad;
String Matricula;

public Alumno(String nombre,int edad,String matricula){
    Nombre=nombre;
    this.edad=edad;
    Matricula=matricula;
}

    @Override
    public String toString() {
        return Nombre+","+edad+","+Matricula;
    }
}
