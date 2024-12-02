import java.util.ArrayList;
import java.util.List;

public class Historico {
    private String paciente;
    private List<String> refHistorico = new ArrayList<>();

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public List<String> getRefHistorico() {
        return refHistorico;
    }

    public void setRefHistorico(List<String> refHistorico) {
        this.refHistorico = refHistorico;
    }
}
