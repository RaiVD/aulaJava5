import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        Scanner palavra = new Scanner(System.in);

        String palavras= palavra.nextLine();
        System.out.println(verificar(palavras));
    }
    public static boolean verificar(String str) {

        String vogais = "a,e,i,o,u";
        String consoantes = "b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,w,z";

        for (int i = 0; i<0; i++) {

            if (str == vogais) {
                return true;
            } else if (str == consoantes+vogais) {
                return false;
            }

        }
        return false;
    }
}
