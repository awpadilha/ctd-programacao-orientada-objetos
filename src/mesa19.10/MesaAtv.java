// Alexandre S. Bastos; André Padilha; Gabriela Schneider; Karina Osuka; Matheus Braga; Nayla Ueda; Rosana Sebould; Wallace Souza;

package Aula02;

import java.util.Scanner;

public class MesaAtv {

    static void ehPrimo (int num) {
        boolean divisivel = false;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) { divisivel = true; }
        }

        if (divisivel || num == 1) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }
    }

    static int MaiorNum (int num1, int num2, int num3) {
        if(num1 >= num2 && num1 >= num3) return num1;
        if(num2 >= num1 && num2 >= num3) return num2;
        else return num3;
    }

    public static void main(String[] args) {
        // Exercício 1

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor: ");

        int num = entrada.nextInt();

        ehPrimo(num);

        // Exercício 2

        System.out.println("Digite três valores: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        System.out.println("O maior valor digitado foi: " + MaiorNum(num1, num2, num3));
    }
}
