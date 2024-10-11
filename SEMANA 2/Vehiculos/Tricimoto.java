public class Tricimoto {
    String color = "Azul";
    String placa = "MBE-1789";
    Integer ano = 2005;
    int capacidad = 4; //el nativo va con abreviacion

    public void info(){
        System.out.println("Información de vehículo:");
        System.out.println("Color: " + this.color);
        System.out.println("Placa: " + this.placa);
        System.out.println("Anio: " + this.ano);
        System.out.println("Capacidad: " + this.capacidad + " pasajeros");
    }
}
