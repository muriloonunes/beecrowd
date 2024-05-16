package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorInicial = ler.nextInt();
        int valor = valorInicial;
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valor / notas[i];
            valor %= notas[i];
        }
        System.out.println(valorInicial);
        System.out.println(quantidadeNotas[0]+" nota(s) de R$ 100,00");
        System.out.println(quantidadeNotas[1]+ " nota(s) de R$ 50,00");
        System.out.println(quantidadeNotas[2]+" nota(s) de R$ 20,00");
        System.out.println(quantidadeNotas[3]+" nota(s) de R$ 10,00");
        System.out.println(quantidadeNotas[4]+" nota(s) de R$ 5,00");
        System.out.println(quantidadeNotas[5]+" nota(s) de R$ 2,00");
        System.out.println(quantidadeNotas[6]+" nota(s) de R$ 1,00");
    }
}
