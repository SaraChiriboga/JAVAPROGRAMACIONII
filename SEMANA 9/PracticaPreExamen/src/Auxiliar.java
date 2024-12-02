public class Auxiliar extends Personal{
    private boolean egresado;
    private boolean tipo; //paramedico o asistente de medico veterinario

    public boolean isEgresado() {
        return egresado;
    }

    public void setEgresado(boolean egresado) {
        this.egresado = egresado;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
