package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codigo = ler.nextInt();
        int quantidade = ler.nextInt();
        double preco = 0;
        if (codigo == 1) {
            double total = quantidade*4;
            System.out.printf("Total: R$ %.2f\n",total);
        } else if (codigo == 2) {
            double total = quantidade*4.5;
            System.out.printf("Total: R$ %.2f\n",total);
        } else if (codigo == 3) {
            double total = quantidade*5;
            System.out.printf("Total: R$ %.2f\n",total);
        } else if (codigo == 4) {
            double total = quantidade*2;
            System.out.printf("Total: R$ %.2f\n",total);
        } else if (codigo == 5) {
            double total = quantidade*1.5;
            System.out.printf("Total: R$ %.2f\n",total);
        }

    }
}