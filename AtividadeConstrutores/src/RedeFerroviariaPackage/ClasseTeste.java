package RedeFerroviariaPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class ClasseTeste {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatacao.parse("25/09/2022");

        RedeFerroviaria RCT = new RedeFerroviaria("Rede Cearense de Trens");
        Locomotiva LC1 = new Locomotiva(55235, 10865, 25);
        Vagao VG1 = new Vagao(8569, "Carga", 8569.56, 4.56, 2.65);
        Trem T1 = new Trem("BRN0857", "Pecém", "Parangaba", data,LC1,VG1);
        LinhasFerroviarias L1 = new LinhasFerroviarias(756, 5556.64, "PCP-MCP", T1, "Está linha sai do Pecém ao Mucuripe" );
        EstacaoFerroviaria E1 = new EstacaoFerroviaria("Pecém", "PCP", "Está é a estação do Pecém", L1);
    }
}
