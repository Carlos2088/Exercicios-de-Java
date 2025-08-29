package ex03;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Informe um numero para ser Somado, subtraido e multiplicado por 3:");
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        a += 3;
        a *= 3;
        a -= 3;
        System.out.println("O resultado dessas operações são:" + a);
    }
}