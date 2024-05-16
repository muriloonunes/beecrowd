package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int temp;
        //colocar o maior em a
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        if (c>a) {
            temp = a;
            a = c;
            c = temp;
        }
        //checar se é triangulo
        if (b+c>a) {
            //determinar tipo do triangulo
            if (a==b && a==c) {
                System.out.println("Valido-Equilatero");

            } else if (a==b || a==c || b==c) {
                System.out.println("Valido-Isoceles");
            } else {
                System.out.println("Valido-Escaleno");
            }
            if (a*a == b*b + c*c ) {
                System.out.println("Retangulo: S");
            } else {
                System.out.println("Retangulo: N");
            }
        } else {
            System.out.println("Invalido");
        }
    }
}