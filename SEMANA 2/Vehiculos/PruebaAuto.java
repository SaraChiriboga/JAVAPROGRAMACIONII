public class PruebaAuto {
    public static void main(String[] args) {
        //OBJETOOOO
        Automovil auto = new Automovil(); //clase instanciada (creación de objeto)
        auto.marca = "BMW"; //se pueden asignar valores despues de instanciar
        auto.modelo = "i320";
        //auto.color = "Blanco";
        auto.cilindraje = 3.2;
        /*
        System.out.println("La marca del auto es: " + auto.marca); //imprimir con salto de línea
        System.out.println("auto. modelo = " + auto. modelo); //otra opcion para imprimir un atributo
        System.out.println("auto.color = " + auto.color);;
        System.out.println("auto.cilindraje = " + auto.cilindraje);*/
        //auto.detalleauto();
        System.out.println(auto.detalleauto2());

        //TRICIMOTO
        Tricimoto trici = new Tricimoto();
        /*
        trici.color = "Blanco";
        trici.placa = "PBG - 3233";
        */
        System.out.println("El color del la tricimoto es: " + trici.color);
        System.out.println("trici.placa = " + trici.placa);
        System.out.println("trici.ano = " + trici.ano);
        System.out.println("trici.capacidad = " + trici.capacidad);
        trici.info();

    }
}

//la clase es el molde, pueden cambiar los atributos (polimorfismo)
//en el main solo se puede interactuar con los atributos y los métodos
//this. diferenciar valores
