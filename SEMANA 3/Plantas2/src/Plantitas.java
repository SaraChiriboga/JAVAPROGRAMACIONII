public class Plantitas{
    public static void main(String[] args) {
        Botanico rosas = new Botanico(); //objeto rosas
        Botanico pino = new Botanico(); //objeto pino
        Botanico orquideas = new Botanico(); //objeto orquideas
        Botanico claveles = new Botanico(); // objeto claveles

        //obtenemos atributos de ROSAS
        rosas.setColor("Blanca");
        rosas.setAnnos(3);
        rosas.setEspecie("No se de especie de rosas");
        rosas.setAltura(40.1);

        //obtenermos atributos de PINO
        pino.setColor("Verde");
        pino.setAnnos(20);
        pino.setEspecie("No se");
        pino.setAltura(30.0);
    }
}
