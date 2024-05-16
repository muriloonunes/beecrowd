package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1 = ler.nextFloat();
        float n2 = ler.nextFloat();
        float n3 = ler.nextFloat();
        float n4 = ler.nextFloat();
        float media = ((2 * n1) + (3 * n2) + (4 * n3) + n4) / 10;
        float nExame, mFinal;
        System.out.printf("Media: %.1f\n", media);
        if (media>=7) {
            System.out.println("Aluno aprovado.");
        } else if (media>= 5.0 && media<=6.9) {
            System.out.println("Aluno em exame.");
            nExame = ler.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", nExame);
            mFinal = (media+nExame)/2;
            if (mFinal>=5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mFinal);
            } else if (mFinal<=4.9) {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mFinal);
            }
        } else if (media<=4.9) {
            System.out.println("Aluno reprovado.");
        }
    }
}