import java.time.LocalDate;
public class Consulta {
    private int cdCons;
    private LocalDate horarioCons;
    private int funCons;
    private int pacienteCons;
    private int consulCons;

    public int getCdCons() {
        return cdCons;
    }

    public void setCdCons(int cdCons) {
        this.cdCons = cdCons;
    }

    public LocalDate getHorarioCons() {
        return horarioCons;
    }

    public void setHorarioCons(LocalDate horarioCons) {
        this.horarioCons = horarioCons;
    }

    public int getFunCons() {
        return funCons;
    }

    public void setFunCons(int funCons) {
        this.funCons = funCons;
    }

    public int getPacienteCons() {
        return pacienteCons;
    }

    public void setPacienteCons(int pacienteCons) {
        this.pacienteCons = pacienteCons;
    }

    public int getConsulCons() {
        return consulCons;
    }

    public void setConsulCons(int consulCons) {
        this.consulCons = consulCons;
    }
}
