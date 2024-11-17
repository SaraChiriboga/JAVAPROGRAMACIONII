package udla.schiriboga.herencia;

public class MainHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //Persona alumno = new Alumno(); //otra forma de instanciar, que tambien sirve porque alumno es hijo de persona

        Alumno alumno = new Alumno();
        alumno.setNombre("Julio");
        alumno.setApellido("Jaramillo");
        alumno.setCarrera("Ing. Software");
        alumno.setEdad(22);
        alumno.setNotaP1(7D);
        System.out.println("Datos del alumno: ");
        System.out.println("Nombre y Apellido: " + alumno.getNombre() + " " + alumno.getApellido());

        AlumnoInt alumnoInt = new AlumnoInt();
        Profesor profesor = new Profesor();
    }
}
