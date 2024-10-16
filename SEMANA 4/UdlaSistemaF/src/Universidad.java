public class Universidad {
    String nombre = "Universidad de las Americas";
    String codigo = "UDLA";

    public Universidad() {
    }

    public String udlaEstudiantes(String infoEstudiante, String infoCalificaciones) {
        String infogeneral = infoEstudiante + infoCalificaciones;
        return infogeneral;
    }
}
