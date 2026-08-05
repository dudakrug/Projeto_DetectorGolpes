import java.util.ArrayList;

public class Resultados
{
    public void exibirResultado()
    {
        DetectorGolpe analise = new DetectorGolpe();

        String classificacao = analise.getClassificacao();
        int pontos = analise.getPontuacao();
        ArrayList<String> motivos = analise.getMotivos();

        System.out.println("Classificação da mensagem: "+ classificacao);
        System.out.println("Pontuação da mensagem: "+ pontos);
        System.out.println("Motivo da classificação da mensagem: "+ motivos);
    }
}
