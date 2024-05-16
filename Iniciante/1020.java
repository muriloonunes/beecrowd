package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias = (idade % 365) % 30;
        System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

    }
}