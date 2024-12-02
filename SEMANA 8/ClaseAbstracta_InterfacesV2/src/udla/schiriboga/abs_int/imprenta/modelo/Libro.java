package udla.schiriboga.abs_int.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro{
    private List<Hoja> paginas;
    private Genero genero;
    private String titulo;
    private Persona autor;

    public Libro(String titulo, Persona autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro(Persona persona) {
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    public String print(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Hoja pag : this.paginas){
            sb.append(pag.print());
        }
        return sb.toString();
    }
}
//implements es la palabra reservada para una interface