package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        int n = 0;

        while (n != numero) {
            int x = ler.nextInt();
            int p = 0;
            for (int divisores = 1; divisores < x; divisores++) {
                if (x % divisores == 0) {
                    p += divisores;
                }
            }
            if (p == x) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
            n++;
        }
    }
}
