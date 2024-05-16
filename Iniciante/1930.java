package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int t1 = ler.nextInt();
        int t2 = ler.nextInt();
        int t3 = ler.nextInt();
        int t4 = ler.nextInt();
        int tomadas = t1+t2+t3+t4;
        int total = tomadas-3;
        System.out.printf("%d\n",total);
    }
}
