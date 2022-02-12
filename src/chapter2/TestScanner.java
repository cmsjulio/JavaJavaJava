package chapter2;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um inteiro: ");
        int inteiro = sc.nextInt();
        System.out.println("Seu número " + inteiro + " ao quadrado vale " + inteiro*inteiro + ".");

        System.out.println("Insira um número real: ");
        double real = sc.nextDouble();
        System.out.println("Seu número " + real + " ao quadrado vale " + real*real + ".");

        System.out.println("Insira dois inteiros e tecle enter.");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println("Insira seu nome e sobrenome.");
        sc = sc.useDelimiter("\n");
        String nome = sc.next();


        System.out.println("Números: " + numero1 + " e " + numero2);
        System.out.println("Seu nome é: " + nome);
    }
}