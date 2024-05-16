package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero= ler.nextInt();
        int n=0;
        int fora=0;
        int dentro=0;
        while (n!=numero) {
            int x = ler.nextInt();
            if (x>=10 && x<=20) {
                dentro++;
            } else {
                fora++;
            }
            n++;
        }
        System.out.println(dentro+" in");
        System.out.println(fora+" out");
    }
}
