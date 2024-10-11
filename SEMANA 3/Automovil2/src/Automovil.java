public class Automovil {
    private String marca; //cambio de estado a privado
    private String modelo;
    private String color = "Verde";
    private int cilindraje;
    private float consumo = 40;

    /*public void getMarca(String marca) {
        this.marca = marca;
    }

    public void writeMarca(String marca){
        this.marca = marca;
    }*/

    public String getMarca() { //getter y setter
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String displayDetails(){
        String details = "La marca es: " + this.marca + "\n" +
                "El modelo es: " + this.modelo + "\n" +
                "El color es: " + this.color + "\n" +
                "El cilindraje es: " + this.cilindraje + "\n";
        return details;
    }

    public String acelerar(){
        return "El auto marca " + this.marca + " esta acelerando...";
    }

    public String frenar(int kmh){
        return "El auto modelo " + this.modelo + " esta frenando a " + kmh + "km/h";
    }

    public float capacidadTanque(int capacidad, float porConsumo){
        float cm = consumo / (capacidad * porConsumo);
        return cm;
    }

    public float capacidadTanque(int capacidad, int porConsumo){
        float cm = consumo / (capacidad * (porConsumo/100)); //SOBRECARGA DE METODOS
        return cm; // ESTO DEMUESTRA EL POLIMORFISMO Y ENCAPSULAMIENTO PORQUE EL MAIN NO SABE LO QUE ESTA PASANDO
    }
}

//principio de ocultamiento: ocultar informacion
//en la programacion real, ningun atributo debe ser visto, se debe llegar a traves de metodos
//en private no se puede acceder directamente al main
//cuando trabajo dentro de la clase no necesito usar get o set
