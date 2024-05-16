package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tempoSeg = ler.nextInt();
        int horas = tempoSeg / 3600;
        int minutos = (tempoSeg % 3600) / 60;
        int segundos = tempoSeg % 60;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}