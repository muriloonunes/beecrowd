package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        int fat=1;
        for (int i = 1; i <= numero; i++) {
            fat*=i;
        }
        System.out.println(fat);
    }
}
