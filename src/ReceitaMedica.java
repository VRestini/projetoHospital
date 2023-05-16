import java.time.LocalDate;

public class ReceitaMedica {
    private int numReceita;
    private String remediosReceita;
    private LocalDate tempoRemedioReceita;
    private int consReceita;

    public int getNumReceita() {
        return numReceita;
    }

    public void setNumReceita(int numReceita) {
        this.numReceita = numReceita;
    }

    public String getRemediosReceita() {
        return remediosReceita;
    }

    public void setRemediosReceita(String remediosReceita) {
        this.remediosReceita = remediosReceita;
    }

    public LocalDate getTempoRemedioReceita() {
        return tempoRemedioReceita;
    }

    public void setTempoRemedioReceita(LocalDate tempoRemedioReceita) {
        this.tempoRemedioReceita = tempoRemedioReceita;
    }

    public int getConsReceita() {
        return consReceita;
    }

    public void setConsReceita(int consReceita) {
        this.consReceita = consReceita;
    }
}
