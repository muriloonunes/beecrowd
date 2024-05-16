package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float a = ler.nextFloat();
        float b = ler.nextFloat();
        float c = ler.nextFloat();
        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            float perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        } else {
            float area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n",area);
        }
    }
}