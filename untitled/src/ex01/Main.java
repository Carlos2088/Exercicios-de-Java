package ex01;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Por favor me passe seu nome: ");
        Scanner leia = new Scanner(System.in);
        String nome = leia.nextLine();
        System.out.println("Olá " + nome + " Seja bem vindo ao sistema");
    }
}