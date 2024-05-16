package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a,b,MEDIA;
        a = ler.nextDouble();
        b = ler.nextDouble();
        MEDIA = (a*3.5 + b*7.5) / 11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
} 
