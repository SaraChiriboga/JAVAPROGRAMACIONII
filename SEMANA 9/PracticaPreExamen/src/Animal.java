import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Animal {
    private String tipo;
    private String nombre;
    private int edad;

    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void register() throws IOException {
        System.out.printf("Nombre del animalito: ");
        setNombre(sc.readLine());
        System.out.printf("Tipo: ");
        setTipo(sc.readLine());
        System.out.printf("Edad: ");
        setEdad(Integer.parseInt(sc.readLine()));
        System.out.println("Paciente registrado con exito!");
    }

    public void showInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Edad: " + getEdad());
    }

    public void showInfoDueno(){

    }
}
