package l3b;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        int inicial = input.nextInt();

        System.out.print("Digite o valor final: ");
        int fin = input.nextInt();

        int somaImpar = 0;

        if (inicial < 0) { // ou else if ((inicial < 0) || fin < 0)
            System.out.println("N�meros inv�lidos, digite um n�mero positivo para o programa funcionar!");
        } else if (inicial > fin) {
            System.out.println("Intervalo de valores inv�lido");
        } else {
            for (int i1 = inicial; i1 <= fin; i1++) {
                if (i1 % 2 != 0) {
                    somaImpar += i1;
                }
            }
            System.out.println("A soma dos n�meros impares �: " + somaImpar);

        }
    }
}
