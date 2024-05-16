package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        if (b > a && b > c) {
            double temp = a;
            a = b;
            b = temp;
        } else if (c > a) {
            double temp = a;
            a = c;
            c = temp;
        }
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
