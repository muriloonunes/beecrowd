package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra = ler.next();
        int count =0;
        for (int i =0; i<palavra.length();i++) {
            count++;
        }
        if (count>=10) {
            System.out.println("palavrao");
        }
        else {
            System.out.println("palavrinha");
        }
    }
}
