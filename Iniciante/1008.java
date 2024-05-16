package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero,horas;
        numero = ler.nextInt();
        horas = ler.nextInt();
        double valorHora = ler.nextDouble();
        double salario = horas * valorHora;
        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
} 