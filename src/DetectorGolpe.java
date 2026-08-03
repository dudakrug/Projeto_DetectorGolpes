public class DetectorGolpe {
    private int pontuacao;
    private String classificacao;
    private String texto;
    String[] palavrasDoTexto;

    public DetectorGolpe() {

    }

    public void dividirTexto(String texto){
        String[] palavrasDoTexto =  texto.split(" ");
    }

    public void definirClassificacao(int pontuacao) {
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
    public String getClassificacao() {
        return classificacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
