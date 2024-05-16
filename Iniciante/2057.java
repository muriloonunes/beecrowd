package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int saida = ler.nextInt();
        int duracaoViagem = ler.nextInt();
        int fuso = ler.nextInt();
        int horaFinal = saida + duracaoViagem + fuso;
        int horaConvertida;
        if (horaFinal == 24) {
            System.out.println("0");
        } else if (horaFinal>24) {
            horaConvertida = horaFinal % 24;
            System.out.printf("%d\n",horaConvertida);
        } else if (horaFinal<0) {
            horaConvertida = horaFinal+24;
            System.out.printf("%d\n",horaConvertida);
        } else {
            System.out.printf("%d\n", horaFinal);
        }
    }
}
