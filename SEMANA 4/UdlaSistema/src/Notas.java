public class Notas {
    String materia;
    Double N1;
    Double N2;
    Double N3;

    //getter y setter de las primera 3 notas
    public Double getN1() {
        return N1;
    }

    public void setN1(Double n1) {
        N1 = n1;
    }

    public Double getN2() {
        return N2;
    }

    public void setN2(Double n2) {
        N2 = n2;
    }

    public Double getN3() {
        return N3;
    }

    public void setN3(Double n3) {
        N3 = n3;
    }

    //metodo para calculo de calificacion final
    public Double notaFinal(Double n1, Double n2, Double n3){
        return (n1 + n2 +n3) / 3;
    }

    //union de informacion
    public String infoCalificaciones(String materia, Double n1, Double n2, Double n3, Double calificacionFinal){
        String libreta = materia + "\t" + n1 + "\t" + n2 + "\t" + n3 + "\t" + calificacionFinal;
        return  libreta;
    }
}
