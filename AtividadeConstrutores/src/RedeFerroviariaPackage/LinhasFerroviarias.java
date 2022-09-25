package RedeFerroviariaPackage;

public class LinhasFerroviarias {

    private int NumLinha;
    private String SiglaLinha, Descriacao;
    private double ExtencaoLinhaM;
    private Trem trem;
    private static int RFtotais = 0;

    public LinhasFerroviarias(int numlinha, double extencaoLinhaM,String siglaLinha, Trem trem, String descriacao){

        this.NumLinha = numlinha;
        this.ExtencaoLinhaM = extencaoLinhaM;
        this.Descriacao = descriacao;
        this.trem = trem;
        this.SiglaLinha = siglaLinha;

        LinhasFerroviarias.RFtotais = LinhasFerroviarias.RFtotais + 1;
    }


    public int getNumLinha() {
        return NumLinha;
    }

    public double getExtencaoLinhaM() {
        return ExtencaoLinhaM;
    }

    public String getDescriacao() {
        return Descriacao;
    }

    public String getSiglaLinha() {
        return SiglaLinha;
    }

    public int getRFtotais() {
        return RFtotais;
    }

    public Trem getTrem() {
        return trem;
    }

    public void setTrem(Trem trem) {
        this.trem = trem;
    }

    public void setNumLinha(int numLinha) {
        NumLinha = numLinha;
    }

    public void setExtencaoLinhaM(double extencaoLinhaM) {
        ExtencaoLinhaM = extencaoLinhaM;
    }

    public void setDescriacao(String descriacao) {
        Descriacao = descriacao;
    }

    public void setSiglaLinha(String siglaLinha) {
        SiglaLinha = siglaLinha;
    }

    public void setRFtotais(int RFtotais) {
        this.RFtotais = RFtotais;
    }
}
