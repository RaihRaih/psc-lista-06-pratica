/*Raissa Rodrigues - Sistemas de Informaçao
 * 2.Faça um programa que preencha dois vetores de dez elementos numéricos
 * cada um e mostre o vetor resultante da intercalação deles. */

import java.util.Scanner;

public class Questao02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] resultado = new int[vetor1.length + vetor2.length];

    System.out.println("Primeiro vetor: ");
    for (int i = 0; i < vetor1.length; i++) {
      System.out.println("Numero na posição: " + (i + 1));
      vetor1[i] = scanner.nextInt();
    }

    System.out.println("\nSegundo vetor: ");
    for (int i = 0; i < vetor2.length; i++) {
      System.out.println("Numero na posição: " + (i + 1));
      vetor2[i] = scanner.nextInt();
    }

    // Copiando os elementos dos vetores para o vetor resultado
    System.arraycopy(vetor1, 0, resultado, 0, vetor1.length);
    System.arraycopy(vetor2, 0, resultado, vetor1.length, vetor2.length);

    // Intercalando os elementos dos vetores e armazenando no vetor resultado
    int indiceVetor1 = 0, indiceVetor2 = 0;
    for (int i = 0; i < resultado.length; i++) {
      if (i % 2 == 0 && indiceVetor1 < vetor1.length) {
        resultado[i] = vetor1[indiceVetor1++];
      } else if (indiceVetor2 < vetor2.length) {
        resultado[i] = vetor2[indiceVetor2++];
      }
    }

    System.out.println("\nVetor Novo: ");
    for (int i = 0; i < resultado.length; i++) {
      System.out.println("Numero na posição: " + (i + 1));
      System.out.println(resultado[i]);
    }
    scanner.close();
  }
}
