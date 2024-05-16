package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int abas = ler.nextInt();
        int acoes = ler.nextInt();
        String acao;
        int contador = 0;
        int total = abas;
        while (contador < acoes) {
            acao = ler.next();
            if (acao.equalsIgnoreCase("fechou")) {
                total += 1;
            } else if (acao.equalsIgnoreCase("clicou")) {
                total -= 1;
            }
            contador++;
        }
        System.out.println(total);
    }
}
