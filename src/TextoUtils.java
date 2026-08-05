import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextoUtils {
    static String entradaUsuario;//mensagem vindo do console pelo user
    static String textoLimpo;//texto de entrada sem pontuação
    static String[] palavrasTexto;
    static List<String> links = new ArrayList<>();
    static List<String> palavrasValidas = new ArrayList<>();

    static String regex = "(https?://\\S+)|(www\\.\\S+)";

    public static void capturaLink(String mensagem){
        entradaUsuario = mensagem; //recebe o texto original do usuário

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(entradaUsuario);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        System.out.println("link: " + links);
    }

    public static void recebeMensagem(String mensagem){
        entradaUsuario = mensagem;//entrada do usuário recebe a mensagem como parâmetro

        capturaLink(entradaUsuario);

        //texto é limpado, passado pra minúsculo e com pontuação retirada
        textoLimpo = entradaUsuario.toLowerCase().replaceAll("[,!.?]", "");

        textoLimpo.replaceAll("\\s+", " ");

        palavrasTexto = textoLimpo.split(" ");//cada palavra é seperada e vai para lista criada
        for (String str : palavrasTexto) {
            if (str != null && !str.isEmpty()) {
                palavrasValidas.add(str);
            }
        }

        System.out.println("Palavras: " + palavrasValidas);
    }
}
