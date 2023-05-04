import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner lerpolegada = new Scanner(System.in);
        double polegadas;

        System.out.println("Qual a polegada: ");
        polegadas = lerpolegada.nextDouble();

        double metros = polegadas*0.0254;

        polegadaemMetro(metros);
    }
    public static double polegadaemMetro (double metros) {
        System.out.println("Você tem: "+ metros + " metros" );

        return metros;
    }
}
