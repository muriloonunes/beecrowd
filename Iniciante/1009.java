package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        double salario = ler.nextDouble();
        double vendas = ler.nextDouble();
        double TOTAL = salario + (vendas*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
    }
} 