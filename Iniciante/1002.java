package Iniciante;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio = ler.nextDouble();
        double area = (3.14159 * raio * raio);
        System.out.printf("A=%.4f\n",area);
    }
 
}
