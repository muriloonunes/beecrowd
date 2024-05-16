package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        int a = n1;
        int b=n2;
        int c=n3;
        int temp;
        if (n1>n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        } if (n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        } if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}