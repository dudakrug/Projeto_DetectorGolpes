import java.util.ArrayList;
import java.util.List;

public class DetectorGolpe {
    private int pontuacao; //pontuacao das mensagens
    private String classificacao; //classificacao final da mensagem
    private ArrayList<String> motivos;//motivos caso o texto seja suspeito

    public void definirPontuacao(){
        String[] palavrasDoTexto = TextoUtils.palavrasTexto;
        List<PalavrasSuspeitas.Dados_Pessoais> listaDePalavrasDados = PalavrasSuspeitas.getListaDePalavrasDados();
        List<PalavrasSuspeitas.Financeiro> listaDePalavrasFinanceiro = PalavrasSuspeitas.getListaDePalavrasFinenceiro();
        List<PalavrasSuspeitas.Urgencia> listaDePalavrasUrgencia = PalavrasSuspeitas.getListaDePalavrasUrgencia();

        //dados = 20, financeiro = 15, urgencia = 10
        for(PalavrasSuspeitas.Dados_Pessoais dadosPessoais : listaDePalavrasDados) {
            for(String palavraTexto : palavrasDoTexto) {
                //getPalavra é um getter que o DadosPessoais tem acesso, conseguimos pegar a string da palavra
                if(palavraTexto.equals(dadosPessoais.getPalavra())){
                    pontuacao+=20;
                    motivos.add(palavraTexto);
                }
            }
        }

        for(PalavrasSuspeitas.Financeiro financeiro : listaDePalavrasFinanceiro) {
            for(String palavraTexto : palavrasDoTexto) {
                if(palavraTexto.equals(financeiro.getPalavra())){
                    pontuacao+=15;
                    motivos.add(palavraTexto);
                }
            }
        }

        for(PalavrasSuspeitas.Urgencia urgencia : listaDePalavrasUrgencia) {
            for(String palavraTexto : palavrasDoTexto) {
                if(palavraTexto.equals(urgencia.getPalavra())){
                    pontuacao+=10;
                    motivos.add(palavraTexto);
                }
            }
        }

    }

    public void definirClassificacao() {
        if(pontuacao <= 20){
            classificacao = "Provavelmente legítma";
        }
        else if(pontuacao <= 40) {
            classificacao = "Suspeita";
        }
        else{
            classificacao = "Provavelmente golpe";
        }
    }

    //getters
    public String getClassificacao() { return classificacao;}
    public int getPontuacao() { return pontuacao;}
    public ArrayList<String> getMotivos() { return motivos;}
}
