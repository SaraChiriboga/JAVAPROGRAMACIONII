public class Botanico {
    //atributos
    String color;
    String especie;
    Double altura;
    int annos;

    //getter y setter de los objetos
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getAnnos() {
        return annos;
    }

    public void setAnnos(int annos) {
        this.annos = annos;
    }

    //metodos
    public void displaydetails(){
        System.out.println("Color de la planta = " + color);
        System.out.println("Especie de la planta = " + especie);
        System.out.println("Altura de la planta = " + altura);
        System.out.println("Edad de la planta (en anios) = " + annos);
    }
    
}
