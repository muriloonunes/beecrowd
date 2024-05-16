package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        int n4 = ler.nextInt();
        int n5 = ler.nextInt();
        int par=0;
        int impar=0;
        int positivo=0;
        int negativo=0;

        if (n1%2==0 || n1==0) {
            par++;
        } else {
            impar++;
        }
        if (n2%2==0 || n2==0) {
            par++;
        } else {
            impar++;
        }
        if (n3%2==0||n3==0) {
            par++;
        } else {
            impar++;
        }
        if (n4%2==0||n4==0) {
            par++;
        } else {
            impar++;
        }
        if (n5%2==0||n5==0) {
            par++;
        } else {
            impar++;
        }
        if (n1>0) {
            positivo++;
        } if (n1<0) {
            negativo++;
        }
        if (n2>0) {
            positivo++;
        } if(n2<0) {
            negativo++;
        }
        if (n3>0) {
            positivo++;
        } if (n3<0) {
            negativo++;
        }
        if (n4>0) {
            positivo++;
        } if (n4<0) {
            negativo++;
        }
        if (n5>0) {
            positivo++;
        } if (n5<0) {
            negativo++;
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");
    }
}
