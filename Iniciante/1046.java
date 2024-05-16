package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horaInicial = ler.nextInt();
        int horaFinal = ler.nextInt();
        int duracao = horaFinal - horaInicial;
        if (horaFinal==horaInicial) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (duracao < 0) {
            duracao += 24;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}