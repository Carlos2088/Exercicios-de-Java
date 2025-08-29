package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     final int numeroCerto = 97;
     System.out.println("De um palpite entre 0 a 100");
      Scanner leia = new Scanner(System.in);
      int palpite = leia.nextInt();
      if (palpite == numeroCerto) {
          System.out.println("Você acertou, Parabéns!" + " O número digitado foi " + palpite);
      } else {
          System.out.println("Parabens voce teve a acapacidade de errar,"+ " O número digitado foi " + palpite +  " tente novamente!");
      }
    }
}
