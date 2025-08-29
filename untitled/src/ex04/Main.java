import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("infome o valor da base");
        Scanner base = new Scanner(System.in);
        int a = base.nextInt();
        System.out.println("infome o valor da altura");
        Scanner altura = new Scanner(System.in);
        int b = altura.nextInt();
        int resultado = a * b;
        System.out.println("O valor da arena é:" + resultado);
        int perimetro = 2 * (a + b);
        System.out.println("O valor do Perimetro é:" + perimetro);
    }
}