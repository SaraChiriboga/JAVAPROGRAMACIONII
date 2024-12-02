package udla.schiriboga.abs_int.imprenta.modelo;

public class Pagina extends Hoja{
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    //metodo abstracto
    public String print() {
        return "";
    }
}
