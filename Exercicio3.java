import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = lerValor.nextLine();

        boolean valor = verificar(senha);
        System.out.println("A senha digitada é valida: ");
    }

    public static boolean verificar(String senha) {
        boolean lerValor = true;
        int qntDigitos = 0;

        for (int i=0; i<senha.length(); i++) {

            if (!Character.isLetterOrDigit(senha.charAt(i))) {
                lerValor = false;
            }
            if (Character.isDigit(senha.charAt(i))) {
                qntDigitos++;
            }
        }
        return (senha.length() >= 10) && (lerValor) && (qntDigitos >= 2);
    }
}
