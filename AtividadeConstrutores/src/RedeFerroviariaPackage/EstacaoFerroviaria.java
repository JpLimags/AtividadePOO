package RedeFerroviariaPackage;

public class EstacaoFerroviaria {

    private String NomeEstacao;
    private String SiglaEstacao;
    private String Descricao;
    private LinhasFerroviarias linhasFerroviaria;

    public EstacaoFerroviaria(String nomeEstacao, String siglaEstacao, String descricao, LinhasFerroviarias linhasFerroviarias){

        this.NomeEstacao = nomeEstacao;
        this.SiglaEstacao = siglaEstacao;
        this.Descricao = descricao;
        this.linhasFerroviaria = linhasFerroviarias;

        System.out.println("Estação ferroviaria construída:");
        System.out.println("");
        System.out.println("Possui "+linhasFerroviarias.getRFtotais()+" linha(as) ferroviaria(as)");
        System.out.println("");
        linhasFerroviaria.getTrem();
        linhasFerroviarias.getTrem().getVagao();
        linhasFerroviarias.getTrem().getLocomotiva();
        System.out.println(" - Número da linha ferroviaria: "+linhasFerroviarias.getNumLinha()+", possui extensao de "+linhasFerroviarias.getNumLinha()+
                " metros de comprimento etem como função "+linhasFerroviarias.getDescriacao()+".\n Possui "+Trem.getTamTrem()+" trem(ns)");

    }

    public String getNomeEstacao() {
        return NomeEstacao;
    }

    public LinhasFerroviarias getLinhasFerroviaria() {
        return linhasFerroviaria;
    }

    public String getSiglaEstacao() {
        return SiglaEstacao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setLinhasFerroviaria(LinhasFerroviarias linhasFerroviaria) {
        this.linhasFerroviaria = linhasFerroviaria;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setSiglaEstacao(String siglaEstacao) {
        SiglaEstacao = siglaEstacao;
    }

    public void setNomeEstacao(String nomeEstacao) {
        this.NomeEstacao = nomeEstacao;
    }
}
