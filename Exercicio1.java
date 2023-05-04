import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");

        Scanner numero = new Scanner(System.in);
        int valor = numero.nextInt();
        System.out.println(verificar(valor));


    }
    public static boolean verificar(int digitos) {

        final int dividir = 10;
        if (digitos == 0){
            return true;
        }
        while (digitos!=0){

            if((digitos % dividir) % 2!= 0){
                return false;
            }
            digitos /= 10;
        }
        return  false;
    }
}
