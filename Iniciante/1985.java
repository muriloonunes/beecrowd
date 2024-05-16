package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int produtos = ler.nextInt();
        int codigo;
        int contador = 0;
        int quantidade;
        double preco = 0;
        double p1=0;
        while (contador < produtos) {
            codigo = ler.nextInt();
            quantidade = ler.nextInt();
            if (codigo==1001) {
                p1=quantidade*1.5;
            }
            else if (codigo==1002) {
                p1 = quantidade*2.5;
            }
            else if (codigo==1003) {
                p1=quantidade*3.5;
            }
            else if (codigo==1004) {
                p1=quantidade*4.5;
            }
            else if (codigo==1005) {
                p1=quantidade*5.5;
            }
            contador++;
            preco+=p1;
        }
        System.out.printf("%.2f\n",preco);
    }

}


