//Importa as bibliotecas necessárias para o código funcionar
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Minha classe para criar as listas
public class PalavrasSuspeitas
{
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


    //main da classe PalavrasSuspeitas
    public static void main(String[] args)
    {
        //para criar uma ArrayList é preciso escrever List<nome da classe> Variavel que armazena as listas = new ArrayList<>();
        List<Dados_Pessoais> ListaDePalavrasDados = new ArrayList<>();

        //Noma da variavel de armazenamento.add(new nome da classe(variaveis globais)
        ListaDePalavrasDados.add(new Dados_Pessoais("senha", 60));
        ListaDePalavrasDados.add(new Dados_Pessoais("cpf", 60));
        ListaDePalavrasDados.add(new Dados_Pessoais("código", 20));
        ListaDePalavrasDados.add(new Dados_Pessoais("token", 20));
        ListaDePalavrasDados.add(new Dados_Pessoais("cartão", 30));


        List<Financeiro> ListaDePalavrasFinenceiro = new ArrayList<>();

        ListaDePalavrasFinenceiro.add(new Financeiro("pix", 10));
        ListaDePalavrasFinenceiro.add(new Financeiro("transferência", 15));
        ListaDePalavrasFinenceiro.add(new Financeiro("deposito", 10));
        ListaDePalavrasFinenceiro.add(new Financeiro("pagamento", 10));
        ListaDePalavrasFinenceiro.add(new Financeiro("dinheiro", 10));


        List<Urgencia> ListaDePalavrasUrgencia = new ArrayList<>();

        ListaDePalavrasUrgencia.add(new Urgencia("urgente", 10));
        ListaDePalavrasUrgencia.add(new Urgencia("agora", 5));
        ListaDePalavrasUrgencia.add(new Urgencia("imediatamente", 10));
        ListaDePalavrasUrgencia.add(new Urgencia("prazo", 5));
        ListaDePalavrasUrgencia.add(new Urgencia("expira", 5));

        //crio o scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Leio a entrada de dados
        System.out.println("Copie e cole o texto do email suspeito: ");
        String Texto = scanner.nextLine();


        //"Limpo" o texto tirando as letras maiúsculas (.toLowerCase()) e tiro as pontuações as trocando por vazio (.replaceAll("[caracteres que quero mudar]", "para oque quero mudar"))
        String TextoLimpo = Texto.toLowerCase().replaceAll("[,!.]", "");
        //cria um vetor que pega separeadamente cada palavra do texto cortando a frase nos espaços por meio do .split(" ");
        String[] PalavrasDoTexto = TextoLimpo.split(" ");


        //Pontuação das palavras suspeitas
        int Pontuacao = 0;

        //A nova variavel PalavraTexto percorre todas as palavras do PalavrasdoTexto
        for(String PalavraTexto : PalavrasDoTexto)
        {
            //cada dado do tipo Dados_Pessoais chamados de suspeito vai percorrer a ListaDePalavrasDados
            for(Dados_Pessoais suspeito : ListaDePalavrasDados)
            {
                //Se a Palavras do texto for igual as palavras de suspeito aumenta com a pontuação já pré definida
                if(PalavraTexto.equals(suspeito.palavra.toLowerCase()))
                {
                    Pontuacao = Pontuacao + suspeito.valor;
                }
            }
            for(Financeiro suspeito : ListaDePalavrasFinenceiro)
            {
                if(PalavraTexto.equals(suspeito.palavra.toLowerCase()))
                {
                    Pontuacao += suspeito.valor;
                }
            }
            for(Urgencia suspeito : ListaDePalavrasUrgencia)
            {
                if(PalavraTexto.equals(suspeito.palavra.toLowerCase()))
                {
                    Pontuacao = Pontuacao + suspeito.valor;
                }
            }
        }


        //diz a pontuação final
        System.out.println("pontuação final: " + Pontuacao + ".");

        //verificação por meio de padrões pré definidos para ver se a mensagem é segura ou é golpe
        if(Pontuacao < 20)
        {
            System.out.println("mensagem provavelmente Légitima.");
        }
        if(Pontuacao < 40 && Pontuacao >= 20)
        {
            System.out.println("Mensagem Suspeita.");
        }
        if(Pontuacao >= 40)
        {
            System.out.println("Mensagem provavelmente golpe.");
        }

        //Encerra a capacidade do scanner de ler as entradas do teclado
        scanner.close();
    }
}
