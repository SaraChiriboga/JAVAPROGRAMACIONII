package udla.schiriboga.abs_int.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{
    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo addExperiencia(String exp){
        experiencia.add(exp);
        return this; //una forma de encadenar
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Nombre    : ");
        sb.append(persona).append("\n")
                .append("Resumen : ").append(this.contenido)
                .append("Profesion  : ").append(this.carrera).append("\n")
                .append("Experiencia   : \n");
        for (String exp : this.experiencia){
            sb.append("-").append(exp).append("\n");
        }
        return sb.toString();
    }
}
