package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int p, j1, j2,r,a, soma;
        p = ler.nextInt();
        j1 = ler.nextInt();
        j2 = ler.nextInt();
        r = ler.nextInt();
        a = ler.nextInt();
        soma = j1 + j2;
        // se a soma for par e o jogador 1 escolheu par
        if (soma%2==0 && p==1) {
            // se o jogador 1 roubou e o j2 acusou
            if (r==1 && a==1) {
                System.out.println("Jogador 2 ganha!");
            }
            // se o j1 roubou e o j2 nao acusou
            else if (r==1 && a==0){
                System.out.println("Jogador 1 ganha!");
            } else if (r==0 & a==0) {
                System.out.println("Jogador 1 ganha!");
            }
            // se o j1 nao roubou e o j2 acusou
            else if (r==0 && a==1) {
                System.out.println("Jogador 1 ganha!");
            }
        }
        // se a soma for par e o jogador 1 escolheu impar
        else if (soma%2==0 && p==0) {
            // se o jogador 1 roubou e o j2 acusou
            if (r==1 && a==1) {
                System.out.println("Jogador 2 ganha!");
            }
            // se o j1 roubou e o j2 nao acusou
            else if (r==1 && a==0){
                System.out.println("Jogador 1 ganha!");
            } else if (r==0 & a==0) {
                System.out.println("Jogador 2 ganha!");
            }
            // se o j1 nao roubou e o j2 acusou
            else if (r==0 && a==1) {
                System.out.println("Jogador 1 ganha!");
            }
        }
        // se a soma for impar e o j1 escolheu par
        else if (soma%2!=0 && p==1) {
            // se o jogador 1 roubou e o j2 acusou
            if (r==1 && a==1) {
                System.out.println("Jogador 2 ganha!");
            }
            // se o j1 roubou e o j2 nao acusou
            else if (r==1 && a==0){
                System.out.println("Jogador 1 ganha!");
            } else if (r==0 & a==0) {
                System.out.println("Jogador 2 ganha!");
            }
            // se o j1 nao roubou e o j2 acusou
            else if (r==0 && a==1) {
                System.out.println("Jogador 1 ganha!");
            }
        }
        // se a soma for impar e o j1 escolheu impar
        else if (soma%2!=0 && p==0) {
            if (r==0 & a==0) {
                System.out.println("Jogador 1 ganha!");
            }
            // se o j1 nao roubou e o j2 acusou
            else if (r==0 && a==1) {
                System.out.println("Jogador 1 ganha!");
            }
        }
    }
}