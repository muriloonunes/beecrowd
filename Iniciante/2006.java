package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int t = ler.nextInt();
        int[] resposta = new int[5];
        for (int i=0;i< resposta.length;i++) {
            resposta[i] = ler.nextInt();
        }
        int acertos=0;
        for (int r:resposta) {
            if (r==t) {
                acertos++;
            }
        }
        System.out.println(acertos);
    }
}
