import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private int cdCons;
    private LocalTime horarioCons;
    private LocalDate dataCons;
    private int funCons;
    private int pacienteCons;
    private int consulCons;

    public int getCdCons() {
        return cdCons;
    }

    public void setCdCons(int cdCons) {
        this.cdCons = cdCons;
    }

    public LocalTime getHorarioCons() {
        return horarioCons;
    }

    public void setHorarioCons(LocalTime horarioCons) {
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

    public LocalDate getDataCons() {
        return dataCons;
    }

    public void setDataCons(LocalDate dataCons) {
        this.dataCons = dataCons;
    }
}
