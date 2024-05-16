package Iniciante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota = ler.nextInt();
        String conceito = "";
        if (nota==0) {
            conceito = "E";
        }
        if (nota>=1 && nota <=35) {
            conceito="D";
        }
        if (nota>=36 && nota <=60) {
            conceito="C";
        }
        if (nota>= 61 && nota<=85) {
            conceito="B";
        }
        if (nota>=86 && nota<=100) {
            conceito="A";
        }
        System.out.println(conceito);
    }
}
