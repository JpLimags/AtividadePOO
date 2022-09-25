package RedeFerroviariaPackage;

public class Vagao {

    private int NumSerie;
    private String Tipo;
    private double CapacidadeCarga;
    private double CompTesteira;
    private double CompEngates;


    public Vagao(int numSerie, String tipo, double capacidadeCarga, double compTesteira, double compEngates){

        this.NumSerie = numSerie;
        this.Tipo = tipo;
        this.CapacidadeCarga = capacidadeCarga;
        this.CompTesteira = compTesteira;
        this.CompEngates = compEngates;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public String getTipo() {
        return Tipo;
    }

    public double getCapacidadeCarga() {
        return CapacidadeCarga;
    }

    public double getCompTesteira() {
        return CompTesteira;
    }

    public double getCompEngates() {
        return CompEngates;
    }

    public void setNumSerie(int numSerie) {
        NumSerie = numSerie;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        CapacidadeCarga = capacidadeCarga;
    }

    public void setCompTesteira(double compTesteira) {
        CompTesteira = compTesteira;
    }

    public void setCompEngates(double compEngates) {
        CompEngates = compEngates;
    }
}
