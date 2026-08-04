import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        String mensagem;
        Scanner scanner = new Scanner(System.in);


        mensagem = scanner.nextLine();

        TextoUtils.recebeMensagem(mensagem);

        mensagem = scanner.nextLine();

        //TextoUtils.capturaLink(mensagem);
        TextoUtils.recebeMensagem(mensagem);

    }
}