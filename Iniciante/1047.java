package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horaInicial = ler.nextInt();
        int minutoInicial = ler.nextInt();
        int horaFinal = ler.nextInt();
        int minutoFinal = ler.nextInt();
        int horarioInicialEmMinutos = horaInicial * 60 + minutoInicial;
        int horarioFinalEmMinutos = horaFinal * 60 + minutoFinal;
        int duracaoEmMinutos;
        if (horarioFinalEmMinutos > horarioInicialEmMinutos) {
            duracaoEmMinutos = horarioFinalEmMinutos - horarioInicialEmMinutos;
        } else if (horarioFinalEmMinutos < horarioInicialEmMinutos) {
            duracaoEmMinutos = (24 * 60 - horarioInicialEmMinutos) + horarioFinalEmMinutos;
        } else {
            duracaoEmMinutos = 24 * 60;
        }
        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
    }
}
