import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fisica extends Persona{
    private String DNI;

    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void registerPersonaFisica() throws IOException {
        System.out.printf("Nombre: ");
        setNombrecliente(sc.readLine());
        System.out.printf("DNI: ");
        setDNI(sc.readLine());
        System.out.printf("Correo: ");
        setEmail(sc.readLine());
        System.out.printf("Direccion: ");
        setDireccion(sc.readLine());
        System.out.printf("Telefono: ");
        setDireccion(sc.readLine());
    }
}
