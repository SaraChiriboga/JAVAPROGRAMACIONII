package udla.schiriboga.herencia;

public class Alumno extends Persona{
    private String carrera;
    private double notaP1;
    private  double notaP2;
    private  double notaP3;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public double getNotaP3() {
        return notaP3;
    }

    public void setNotaP3(double notaP3) {
        this.notaP3 = notaP3;
    }
}
