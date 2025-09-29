
import java.util.Scanner;

public class Beec1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f", a * c / 2.0);
        System.out.printf("CIRCULO: %.3f", Math.PI * (c * c));
        System.out.printf("TRAPEZIO: %.3f", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f", b * b);
        System.out.printf("RETANGULO: %.3f", a * b);
    }
}