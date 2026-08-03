import java.util.Arrays;

public class TextoUtils {
    static String entradaUsuario;//mensagem vindo do console pelo user
    static String textoLimpo;//texto de entrada sem pontuação
    static String[] palavrasTexto;


    public static void recebeMensagem(String mensagem){
        entradaUsuario = mensagem;

        textoLimpo = entradaUsuario.toLowerCase().replaceAll("[,!.?]", "");
        System.out.println(textoLimpo);
        palavrasTexto = textoLimpo.split(" ");
        System.out.println(Arrays.toString(palavrasTexto));
    }
}
