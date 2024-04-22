/*Raissa Rodrigues - Sistemas de Informação
Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes.
O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos.
Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.*/

import java.util.Random;

public class Questao03 {

  public static void main(String[] args) {
    Random random = new Random();

    int[] numeros = new int[8];
    int[] negativos = new int[8]; //numeros positivos
    int[] positivos = new int[8]; //numeros negativos
    int contPositivos = 0;
    int contNegativos = 0;

    // Preenchendo o vetor com 8 números inteiros aleatórios entre -8 a 8
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = random.nextInt(17) - 8; // Gera números de -8 a 8
    }

    //numeros positivos e numeros negativos
    for (int i = 0; i < negativos.length; i++) {
      if (numeros[i] >= 0) {
        if (contPositivos < positivos.length) {
          positivos[contPositivos++] = numeros[i];
        }
      } else {
        if (contNegativos < negativos.length) {
          negativos[contNegativos++] = numeros[i];
        }
      }
    }
    // Mostrando o vetor de números total
    System.out.println("Números:");
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }
    // Mostrando o vetor de números positivos
    System.out.println("Números positivos:");
    for (int i = 0; i < contPositivos; i++) {
      System.out.println(positivos[i]);
    }

    // Mostrando o vetor de números negativos
    System.out.println("\nNúmeros negativos:");
    for (int i = 0; i < contNegativos; i++) {
      System.out.println(negativos[i]);
    }
  }
}
