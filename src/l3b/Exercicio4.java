package l3b;
// soma de n�meros inteiro e positivos
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de n�meros que voc� quer efetuar a soma: ");

        int numerosInteiros = input.nextInt();
        int valor = 0;
        int soma = 0;

        for (int contador = 0; contador < numerosInteiros; contador++) {
            Scanner numeros = new Scanner(System.in);
            System.out.print("Digite um n�mero: ");
            valor = input.nextInt();
            soma += valor; // = soma = soma + valor;

        }
        if (numerosInteiros <= 0) {
            System.out.println("N�mero inv�lido, digite um n�mero inteiro ou positivo!!!");
        } else {
            System.out.print("O resultado da soma dos n�meros inteiros e positivo �: " + soma);
        }

    }
}
