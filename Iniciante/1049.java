package Iniciante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String p1 = ler.next();
        String p2 = ler.next();
        String p3 = ler.next();
        if (p1.equalsIgnoreCase("vertebrado")) {
            if (p2.equalsIgnoreCase("ave")) {
                if (p3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else if (p3.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (p2.equalsIgnoreCase("mamifero")) {
                if (p3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (p3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (p1.equalsIgnoreCase("invertebrado")) {
            if (p2.equalsIgnoreCase("inseto")) {
                if (p3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (p3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (p2.equalsIgnoreCase("anelideo")) {
                if (p3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (p3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}