import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextoUtils {
    static String entradaUsuario;//mensagem vindo do console pelo user
    static String textoLimpo;//texto de entrada sem pontuação
    static String[] palavrasTexto;

    static String regex = "(https?://\\S+)|(www\\.\\S+)";


    public static void recebeMensagem(String mensagem){
        entradaUsuario = mensagem;//entrada do usuário recebe a mensagem como parâmetro

        //texto é limpado, passado pra minúsculo e com pontuação retirada
        textoLimpo = entradaUsuario.toLowerCase().replaceAll("[,!.?]", "");
        System.out.println(textoLimpo);

        palavrasTexto = textoLimpo.split(" ");//cada palavra é seperada e vai para lista criada
        System.out.println(Arrays.toString(palavrasTexto));
    }
}
