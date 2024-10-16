//FUTBOL 11
//ECUADOR 3-4-3
public class Main {
    public static void main(String[] args) {
        //instanciar: jugadores
        Jugadores galindez = new Jugadores("Hernan", "Galindez", 1, "Arquero");
        Jugadores torres = new Jugadores("Felix", "Torres", 2, "Defensa Derecho");
        Jugadores pacho = new Jugadores("William", "Pacho", 6, " Defensa Central");
        Jugadores pierito = new Jugadores("Piero", "Hincapie", 3, "Defensa Izquierdo");
        Jugadores preciado = new Jugadores("Angelo", "Preciado", 17, "Volante Derecho");
        Jugadores franco = new Jugadores("Alan", "Franco", 21, "Volante Central");
        Jugadores moi = new Jugadores("Moises", "Caicedo", 23, "Volante Central"); //capitan
        Jugadores pervis = new Jugadores("Pervis", "Estupiñan", 7, "Volante Izquierdo");
        Jugadores plata = new Jugadores("Gonzalo", "Plata", 19, "Delantero");
        Jugadores valencia = new Jugadores("Enner", "Valencia", 13, "Delantero");
        Jugadores sarmiento = new Jugadores("Jeremy", "Sarmiento", 16, "Delantero");

        //alineacion
        //usando el objeto capitan para hacer la alineacion
        moi.imprimirAlineacion343(galindez.apellido + "(" + galindez.numCamiseta +")", torres.apellido + "(" + torres.numCamiseta +")",
                pacho.apellido + "(" + pacho.numCamiseta +")", pierito.apellido + "(" + pierito.numCamiseta +")",
                preciado.apellido + "(" + preciado.numCamiseta +")", franco.apellido + "(" + franco.numCamiseta +")",
                moi.apellido + "(" + moi.numCamiseta +")", pervis.apellido + "(" + pervis.numCamiseta +")",
                plata.apellido + "(" + plata.numCamiseta +")", valencia.apellido + "(" + valencia.numCamiseta +")",
                sarmiento.apellido + "(" + sarmiento.numCamiseta +")");
    }
}