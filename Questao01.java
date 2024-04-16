
/*Raissa Rodrigues - Sistemas de Informacao
Faça um programa que preencha um vetor com nove números inteiros,
calcule e mostre os números primos e suas respectivas posições. -  #primos divisivel por ele mesmo e por 1 */
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[9];
        int div = 0;

        System.out.println("Digite nove números inteiros");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = scanner.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            for (int j = 1; j <= numero.length; j++) {
                if (numero[i] % j == 0){
                div ++;
                }
                if (div <= 2){
                    System.out.println("Numero: " + numero[i] + " eh primo.\nPosicao: " + i);
                }
                
            }
            div = 0;
        }
    }
}
