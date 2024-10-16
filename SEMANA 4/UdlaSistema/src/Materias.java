public class Materias {
    String codigo;
    String NRC;
    String nombreMateria;

    //getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    //metodo para mostrar info (SOLO VA MOSTRAR EL NOMBRE DE LA MATERIA, LOS DEMAS DATOS PUEDEN SER INNECESARIOS EN CIERTO CONTEXTO)
    public String infoMateria(String nombreMateria){
        String infoMat = nombreMateria;
        return infoMat;
    }
}
