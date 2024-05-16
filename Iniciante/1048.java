package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario = ler.nextDouble();
        if (0 < salario && salario <= 400) {
            double novoSalario = salario + 0.15 * salario;
            double reajuste = 0.15 * salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        } else if (400 < salario && salario <= 800) {
            double novoSalario = salario + 0.12 * salario;
            double reajuste = 0.12 * salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        }
        if (800 < salario && salario <= 1200) {
            double novoSalario = salario + 0.1 * salario;
            double reajuste = 0.1 * salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        }
        if (1200 < salario && salario <= 2000) {
            double novoSalario = salario + 0.07 * salario;
            double reajuste = 0.07 * salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        }
        if (salario > 2000) {
            double novoSalario = salario + 0.04 * salario;
            double reajuste = 0.04 * salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}