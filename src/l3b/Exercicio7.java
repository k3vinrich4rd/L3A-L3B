package l3b;

import java.util.Scanner;

public class Exercicio7 {
    // Para saber se um n�mero � primo ou n�o
    public static boolean primo(int numero) {

        if ((numero == 1) || (numero == 0))
            return (false);
        else {
            int i = 0;
            int fim = 0;
            fim = (int) Math.sqrt(numero);

            for (i = 2; i <= fim; i++) {
                if ((numero % i) == 0)
                    return (false);

            }
            return (true);

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero e s�iba se � um n�mero primo: ");
        int numero = input.nextInt();

        if(primo(numero)){
            System.out.print("O n�mero "+numero+" � primo.");
        }else{
            System.out.print("O n�mero " +numero+ " n�o � primo.");
        }

    }
}


