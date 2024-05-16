package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, a, b;
        int contador = 0;
        int resposta = 0;
        n = ler.nextInt();
        while (contador < n) {
            a = ler.nextInt();
            b = ler.nextInt();
            resposta+=a*b;
            contador++;
        }
        System.out.println(resposta);
    }
}
