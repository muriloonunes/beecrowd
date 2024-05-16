package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int M1=(a+b+Math.abs(a-b))/2;
        int MaiorTotal=(M1+c+Math.abs(M1-c))/2;
        System.out.println(MaiorTotal+" eh o maior");
    }
}