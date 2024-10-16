public class Jugadores {
    //atributos
    String nombre;
    String apellido;
    Integer numCamiseta;
    String posicion;

    //metodos setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(Integer numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //constructor para evitar el getter y setter
    public Jugadores(String nombre, String apellido, Integer numCamiseta, String posicion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCamiseta = numCamiseta;
        this.posicion = posicion;
    }

    //metodos
    //imprimir alineacion
    public void imprimirAlineacion343(String arquero, String dDerecho, String dCentral, String dIzquierdo, String vDerecho, String vCentral1, String vCentral2, String vIzquierdo, String delantero1, String delantero2, String delantero3){
        System.out.println("==================== ECUADOR 3-4-3 ====================");
        System.out.println("                      " + arquero);
        System.out.println("\n");
        System.out.println("     " + dDerecho + "          " + dCentral + "          " + dIzquierdo);
        System.out.println("\n");
        System.out.println("  " + vDerecho + "   " + vCentral1 + "   " + vCentral2 + "   " + vIzquierdo);
        System.out.println("\n");
        System.out.println("     " + delantero1 + "          " + delantero2 + "          " + delantero3);
    }

    //imprimir info de cada jugador
}
