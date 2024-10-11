public class Mainn {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);

        System.out.println("Marca = " + bmw.getMarca());

        /*System.out.println("DATOS:\n " + bmw.displayDetails());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar( 80) = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(40, 0.7f) = " + bmw.capacidadTanque(40, 0.7f)); //incluir la letra inicial del valor si es nativo flotante*/
    }
}
