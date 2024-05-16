package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod1 = ler.nextInt();
        int num1 = ler.nextInt();
        double val1 = ler.nextDouble();
        int cod2 = ler.nextInt();
        int num2 = ler.nextInt();
        double val2 = ler.nextDouble();
        double vtotal1 = num1 * val1;
        double vtotal2 = num2 * val2;
        double TOTAL = vtotal1 + vtotal2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);
    }
} 