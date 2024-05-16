package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int curupira = ler.nextInt();
        int totalCurupira = curupira*300;
        int boitata = ler.nextInt();
        int totalBoitata = boitata*1500;
        int boto = ler.nextInt();
        int totalBoto = boto*600;
        int mapinguari = ler.nextInt();
        int totalMapinguari = mapinguari*1000;
        int iara = ler.nextInt();
        int totalIara = iara*150;
        int total = totalCurupira+totalBoitata+totalBoto+totalMapinguari+totalIara+225;
        System.out.println(total);
    }

}
