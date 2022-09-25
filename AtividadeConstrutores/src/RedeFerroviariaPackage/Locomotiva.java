package RedeFerroviariaPackage;

public class Locomotiva {

    private int NumSerie;
    private double CapTracao;
    private double Comprimento;

    public Locomotiva(int numSerie, double capTracao, double comprimento){

        this.NumSerie = numSerie;
        this.CapTracao = capTracao;
        this.Comprimento = comprimento;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public double getCapTracao() {
        return CapTracao;
    }

    public double getComprimento() {
        return Comprimento;
    }

    public void setNumSerie(int numSerie) {
        NumSerie = numSerie;
    }

    public void setCapTracao(double capTracao) {
        CapTracao = capTracao;
    }

    public void setComprimento(double comprimento) {
        Comprimento = comprimento;
    }
}
