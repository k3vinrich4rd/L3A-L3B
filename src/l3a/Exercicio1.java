package l3a;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo n�mero: ");
        double numero2 = input.nextDouble();
        input.close();

        if (numero1 > numero2) {
            System.out.print("O primeiro n�mero digitado que foi o " + numero1 + " � maior que o segundo n�mero!");
        } else if (numero2 > numero1) {
            System.out.print("O segundo n�mero digitado que foi o " + numero2 + ", � maior que o primeiro n�mero!");

        } else {
            System.out.println("Os n�meros n�o podem ser iguais, digite n�meros diferentes!");
        }
    }
}


