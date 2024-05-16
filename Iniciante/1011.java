package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio = ler.nextDouble();
        double VOLUME = (4 * 3.14159 * Math.pow(raio,3))/3;
        System.out.printf("VOLUME = %.3f\n",VOLUME);
    }
} 