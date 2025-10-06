
import java.util.Scanner;

public class Beec1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if ((A == 0) | (B * B - 4 * A * C < 0)) {
            System.out.println("Impossivel calcular");
            return;
        }

        double r = Math.sqrt((B * B) - 4 * A * C);

        System.out.printf("R1 = %.5f\n", (-B + r) / (2 * A));
        System.out.printf("R2 = %.5f\n", (-B - r) / (2 * A));
    }
}
