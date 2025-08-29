package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe um valor para A: ");
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        System.out.println("Informe um valor para B: ");
        int b = leia.nextInt();
        System.out.println("Informe um valor para C: ");
        int c = leia.nextInt();

        int x = 4*a + 5*b - 3*c + a*b + a*c - (b*c) /2;
        System.out.println("O resultado é: " + x);

    }
}