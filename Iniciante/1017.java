package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double tempo = ler.nextDouble();
        double velMedia = ler.nextDouble();
        double gasto = (tempo * velMedia)/12;
        System.out.printf("%.3f\n",gasto);
    }
} 