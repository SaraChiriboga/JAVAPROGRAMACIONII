package udla.schiriboga.abs_int.imprenta.modelo;

public class Informe extends Hoja{
    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String print() {
        return "Informe escrito por : " + this.autor +
                "\nRevisado por   :" + this.revisor + "\n" +
                this.contenido;
    }
}
//java sugiere poner en final si no hay getters y setters