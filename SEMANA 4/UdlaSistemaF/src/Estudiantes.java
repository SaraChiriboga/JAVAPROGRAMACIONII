
public class Estudiantes {
    String Nombres;
    String Apellidos;
    String banner;
    int CI;

    public Estudiantes() {
    }

    public int getCI() {
        return this.CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getBanner() {
        return this.banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }

    public String getNombres() {
        return this.Nombres;
    }

    public void setNombres(String nombres) {
        this.Nombres = nombres;
    }

    public String detallesEstudiante(String universidad, String nombres, String apellidos, String banner, int CI) {
        String infoEstudiante = universidad + "\t" + nombres + "\t" + apellidos + "\t" + banner + "\t" + CI + "\t";
        return infoEstudiante;
    }
}
