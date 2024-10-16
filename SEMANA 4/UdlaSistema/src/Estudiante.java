public class Estudiante {
    String Nombres;
    String Apellidos;
    String banner;
    int  CI;

    //getters y setters (con el BUFFERREADER quedan de adorno)
    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    //union de los datos para imprimir (metodo)
    public String detallesEstudiante(String universidad, String nombres, String apellidos, String banner, int CI){
        String infoEstudiante = universidad + "\t" + nombres + "\t" + apellidos + "\t" + banner + "\t" + CI + "\t";
        return infoEstudiante;
    }
}
