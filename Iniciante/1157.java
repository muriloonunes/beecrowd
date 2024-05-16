package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        for (int divisores = 1; divisores <= x; divisores++) {
            if (x % divisores == 0) {
                System.out.println(divisores);
            }

        }

    }

}
