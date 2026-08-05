import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder mensagem = new StringBuilder();

        System.out.println("Cole a mensagem.");
        System.out.println("Digite FIM para finalizar.\n");

        while (true) {

            String linha = scanner.nextLine();

            if (linha.equalsIgnoreCase("FIM")) {
                break;
            }

            mensagem.append(linha);
            mensagem.append(" ");

        }

        TextoUtils.recebeMensagem(mensagem.toString());
    }

}