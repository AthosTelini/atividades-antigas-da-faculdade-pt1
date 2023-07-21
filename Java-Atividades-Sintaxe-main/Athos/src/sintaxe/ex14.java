package sintaxe;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in,"iso8859-1");
        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        int cont = 0;
        int i = 0;
        while (i < palavra.length()) {
            if (palavra.charAt(i) == 'a') {
                cont++;
            }
            i++;
        }
        System.out.println(" Tem " + cont + " letras a.");
    }
}
