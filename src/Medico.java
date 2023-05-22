public class Medico {
    private int cdMed;
    private String nomeMed;
    private EspecializacaoMedico especializacaoMed;
    private int telefoneMed;
    private String docCrm;

    public int getCdMed() {
        return cdMed;
    }

    public void setCdMed(int cdMed) {
        this.cdMed = cdMed;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public EspecializacaoMedico getEspecializacaoMed() {
        return especializacaoMed;
    }

    public void setEspecializacaoMed(EspecializacaoMedico especializacaoMed) {
        this.especializacaoMed = especializacaoMed;
    }

    public int getTelefoneMed() {
        return telefoneMed;
    }

    public void setTelefoneMed(int telefoneMed) {
        this.telefoneMed = telefoneMed;
    }

    public String getDocCrm() {
        return docCrm;
    }

    public void setDocCrm(String docCrm) {
        this.docCrm = docCrm;
    }
}
