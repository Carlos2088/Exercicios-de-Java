package ex02;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Informe 3 numeros para fazer a soma");
        Scanner leianumero = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        int a = leianumero.nextInt();
        System.out.println("informe o segundo numero");
        int b = leianumero.nextInt();
        System.out.println("informe o terceiro numero");
        int c = leianumero.nextInt();
        int soma = a + b + c;
        System.out.println("A soma dos numeros é:" + soma);
    }
}