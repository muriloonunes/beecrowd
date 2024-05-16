package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A = ler.nextInt();
        int media = ler.nextInt();
        int B = 2*media-A;
        System.out.println(B);
    }

}
