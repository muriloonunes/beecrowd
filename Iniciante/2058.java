package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lados = ler.nextInt();
        int triangulos = lados-2;
        System.out.println(triangulos);
    }

}
