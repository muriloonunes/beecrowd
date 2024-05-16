package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        while (numero < 5 || numero > 2000) {
            numero = ler.nextInt();
        }
        int n1 = 2;
        double resultado;

        while (n1 <= numero) {
            resultado = Math.pow(n1, 2);
            System.out.printf("%d^2 = %.0f\n",n1,resultado);
            n1 += 2;
        }
    }
}
