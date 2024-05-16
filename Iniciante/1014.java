package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int X = ler.nextInt();
        double Y = ler.nextDouble();
        double consumo = X/Y;
        System.out.printf("%.3f km/l\n",consumo);
    }
} 