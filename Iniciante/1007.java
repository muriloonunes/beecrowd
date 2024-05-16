package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,c,d,DIFERENCA;
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        d = ler.nextInt();
        DIFERENCA = (a * b - c * d);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
} 