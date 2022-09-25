package RedeFerroviariaPackage;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Trem {

    SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");

    private String Prefixo;
    private Date DataFormacao;
    private Vagao vagao;
    private Locomotiva locomotiva;
    private String EstacaoOrigem;
    private String EstacaoDestino;
    private static int TamTrem = 0;

    public Trem(String prefixo, String estacaoOrigem, String estacaoDestino, Date dataFormacao, Locomotiva locomotiva, Vagao vagao){

        this.Prefixo = prefixo;
        this.EstacaoOrigem = estacaoOrigem;
        this.EstacaoDestino = estacaoDestino;
        this.DataFormacao = dataFormacao;
        this.locomotiva = locomotiva;
        this.vagao = vagao;
        Trem.TamTrem = Trem.TamTrem + 1;
    }

    public String getPrefixo() {
        return Prefixo;
    }

    public String getEstacaoOrigem() {
        return EstacaoOrigem;
    }

    public String getEstacaoDestino() {
        return EstacaoDestino;
    }

    public Date getDataFormacao() {
        return DataFormacao;
    }

    public Locomotiva getLocomotiva() {
        return locomotiva;
    }

    public Vagao getVagao() {
        return vagao;
    }

    public static int getTamTrem() {
        return TamTrem;
    }

    public void setPrefixo(String prefixo) {
        Prefixo = prefixo;
    }

    public void setEstacaoOrigem(String estacaoOrigem) {
        EstacaoOrigem = estacaoOrigem;
    }

    public void setEstacaoDestino(String estacaoDestino) {
        EstacaoDestino = estacaoDestino;
    }

    public void setDataFormacao(Date dataFormacao) {
        DataFormacao = dataFormacao;
    }

    public void setLocomotiva(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
    }

    public void setVagao(Vagao vagao) {
        this.vagao = vagao;
    }

    public static void setTamTrem(int tamTrem) {
        TamTrem = tamTrem;
    }
}
