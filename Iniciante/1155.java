package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double denominador = 2.0;
        double termo;
        double s=1.0;
        double numerador=3.0;
        while (denominador<=262144) {
            termo =numerador/denominador;
            s=s+termo;
            numerador=numerador+2;
            denominador=denominador*2;
        }
        System.out.printf("%.2f\n",s);
    }
}
