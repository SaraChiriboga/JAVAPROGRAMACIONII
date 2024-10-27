public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private int cilindraje;
    private float consumo;
    static String tipo = "SUV";

    //constructores
    public Automovil() {
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color) {
        this(marca, modelo);
        this.color = color;
    }

    public Automovil(String marca, String modelo, String color, int cilindraje) {
        this(marca, modelo, color);
        this.cilindraje = cilindraje;
    }

    public Automovil(String marca, String modelo, String color, int cilindraje, float consumo) {
        this(marca, modelo, color, cilindraje);
        this.consumo = consumo;
    }

    //GETTERS Y SETTERS

    public String getMarca() {
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

    //METODOS PROPIOS
    public String displayDetails(){
        String details = "La marca es: " + this.marca + "\n" +
                "El modelo es: " + this.modelo + "\n" +
                "El color es: " + this.color + "\n" +
                "El tipo de auto es: " + Automovil.tipo + "\n" +
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
