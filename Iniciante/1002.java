package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = ler.nextInt();
        int contador = 0;
        String palavra;
        double tempo;
        while (contador < c) {
            palavra = ler.next();
            tempo = (double) palavra.length() /100;
            System.out.printf("%.2f\n",tempo);
            contador++;
        }
    }
}