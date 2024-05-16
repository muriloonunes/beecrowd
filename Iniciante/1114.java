package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha = 0;
        while (senha != 2002) {
            senha = ler.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        }
        System.out.println("Acesso Permitido");
    }
} 
