package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a,b,c,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        TRIANGULO = (a * c)/2;
        CIRCULO = (3.14159 * c * c);
        TRAPEZIO = ((a+b)*c) /2;
        QUADRADO = b * b;
        RETANGULO = a * b;
        System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n",CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n",QUADRADO);
        System.out.printf("RETANGULO: %.3f\n",RETANGULO);
    }
} 