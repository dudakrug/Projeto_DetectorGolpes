//Importa as bibliotecas necessárias para o código funcionar
import java.util.List;
import java.util.ArrayList;

//Minha classe para criar as listas
public class PalavrasSuspeitas
{
    //para criar uma ArrayList é preciso escrever List<nome da classe> Variavel que armazena as listas = new ArrayList<>();
    //deixando privado para criar um metodo getters
    private static final List<Dados_Pessoais> listaDePalavrasDados = new ArrayList<>();
    private static final List<Financeiro> listaDePalavrasFinenceiro = new ArrayList<>();
    private static final List<Urgencia> listaDePalavrasUrgencia = new ArrayList<>();


    //Classes para cada tipo de palavra
    public static class Dados_Pessoais
    {
        String palavra;
        int valor;

        public Dados_Pessoais(String palavra, int valor)
        {
            //criação das variaveis globais para poderem ser acessadas fora dessa classe
            this.palavra = palavra;
            this.valor = valor;
        }
    }

    public static class Urgencia
    {
        String palavra;
        int valor;

        //precisa ter o mesmo nome a classe e esse metodo, ex: Urgencia
        public Urgencia(String palavra, int valor)
        {
            this.palavra = palavra;
            this.valor = valor;
        }
    }

    public static class Financeiro
    {
        String palavra;
        int valor;

        public Financeiro(String palavra, int valor)
        {
            this.palavra = palavra;
            this.valor = valor;
        }
    }


    //metodo getters
    public static List<Dados_Pessoais> getListaDePalavrasDados()
    {
        return listaDePalavrasDados;
    }

    public static List<Financeiro> getListaDePalavrasFinenceiro()
    {
        return listaDePalavrasFinenceiro;
    }

    public static List<Urgencia> getListaDePalavrasUrgencia()
    {
        return listaDePalavrasUrgencia;
    }


    public static void Add(){
        //Noma da variavel de armazenamento.add(new nome da classe(variaveis globais)
        listaDePalavrasDados.add(new Dados_Pessoais("senha", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("cpf", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("código", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("token", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("cartão", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("dados", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("documento", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("instale", 20));
        listaDePalavrasDados.add(new Dados_Pessoais("localização", 20));

        listaDePalavrasFinenceiro.add(new Financeiro("pix", 15));
        listaDePalavrasFinenceiro.add(new Financeiro("transferência", 15));
        listaDePalavrasFinenceiro.add(new Financeiro("deposito", 15));
        listaDePalavrasFinenceiro.add(new Financeiro("pagamento", 15));
        listaDePalavrasFinenceiro.add(new Financeiro("dinheiro", 15));
        listaDePalavrasFinenceiro.add(new Financeiro("banco", 15));
        listaDePalavrasFinenceiro.add(new Financeiro("compra", 15));

        listaDePalavrasUrgencia.add(new Urgencia("urgente", 10));
        listaDePalavrasUrgencia.add(new Urgencia("agora", 10));
        listaDePalavrasUrgencia.add(new Urgencia("imediatamente", 10));
        listaDePalavrasUrgencia.add(new Urgencia("prazo", 10));
        listaDePalavrasUrgencia.add(new Urgencia("prazos", 10));
        listaDePalavrasUrgencia.add(new Urgencia("expira", 10));
        listaDePalavrasUrgencia.add(new Urgencia("bloqueio", 10));
        listaDePalavrasUrgencia.add(new Urgencia("troquei", 10));
        listaDePalavrasUrgencia.add(new Urgencia("socorro", 10));
        listaDePalavrasUrgencia.add(new Urgencia("oferta", 10));
        listaDePalavrasUrgencia.add(new Urgencia("prêmio", 10));
    }

}
