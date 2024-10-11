public class Plantitas {
    public static void main(String[] args) {
        Botanico rosas = new Botanico();
        rosas.especie = "Ecuatoriana";
        rosas.altura = 20.6;
        rosas.annos = 2;
        rosas.displaydetails();

        System.out.println("\n");

        Botanico pino = new Botanico(); //objeto pino
        pino.color = "Verde";
        pino.especie = "";
        pino.altura = 190.8;
        pino.annos = 20;
        pino.displaydetails();

        System.out.println("\n");

        Botanico orquideas = new Botanico(); //objeto orquideas
        orquideas.color = "Morada";
        orquideas.especie = "";
        orquideas.annos = 3;
        orquideas.altura = 30.0;
        orquideas.displaydetails();

        System.out.println("\n");

        Botanico claveles = new Botanico(); // objeto claveles
        claveles.color = "Blanca";
        claveles.especie = "";
        claveles.annos = 1;
        claveles.altura = 15.0;
        claveles.displaydetails();
    }
}
