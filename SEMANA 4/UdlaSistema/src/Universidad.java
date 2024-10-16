public class Universidad {
    String nombre = "Universidad de las Americas";
    String codigo = "UDLA";

    //metodo para juntar toda la informacion
    public String udlaEstudiantes(String infoEstudiante, String infoCalificaciones){
        String infogeneral = infoEstudiante + infoCalificaciones;
        return  infogeneral;
    }
}
