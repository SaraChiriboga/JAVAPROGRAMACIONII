import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class ElementoHistorico {
    private String peso;
    private String estatura;
    private List<String> sintomas = new ArrayList<>();
    private List<String> observaciones = new ArrayList<>();
    private List<String> receta = new ArrayList<>();

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    public List<String> getObservaciones() {
        return observaciones;
    }

    public ElementoHistorico setObservaciones(String observacion) {
        return this;
    }

    public List<String> getReceta() {
        return receta;
    }

    public ElementoHistorico setReceta(String receta) {
        return this;
    }


}
