import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner palavra = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String str= palavra.nextLine();

        System.out.println(verificar(str));
    }
    public static boolean verificar(String input) {

        String vogais = "a,e,i,o,u";
        String teste = input.toLowerCase();

        for (int i = 0; i<teste.length(); i++) {
            if (vogais.indexOf(teste.charAt(i)) == -1); {
                return true;
            }
        }
        return false;
    }
}
