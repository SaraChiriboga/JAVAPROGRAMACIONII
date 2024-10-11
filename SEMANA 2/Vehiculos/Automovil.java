    class Automovil{
        String marca;
        String modelo;
        String color = "Negro";
        double cilindraje;

        public void detalleauto(){ //CREACION DE METODO
            System.out.println("La marca del auto es: " + marca);
            System.out.println("auto. modelo = " + modelo);
            System.out.println("auto.color = " + color);;
            System.out.println("auto.cilindraje = " + cilindraje);
        }

        public String detalleauto2() {
            StringBuilder sb = new StringBuilder(); //CONCATENACIÓN
            sb.append("La marca del auto es: " + marca + " ");
            sb.append("auto.modelo: " + modelo + " ");
            sb.append("auto.color: " + color + " ");
            sb.append("auto.cilindraje: " + cilindraje + " ");
            return sb.toString(); //toString() transforma cualquier caracter que no sea texto
        }
    }
