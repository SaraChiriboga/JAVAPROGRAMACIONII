package udla.schiriboga.abs_int.imprenta.modelo;

abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String print();
}

//puede ponerse el "abstract" antes o despues del public
//una clase abstracta puede o no tener metodos abstractos
//para que hayan metodos abstractos la clase DEBE ser abstracta
//se usan las clases abstractas cuando hay clases con metodos comunes