
import java.util.Scanner;

public class Beec1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = (((a * 3.5) + (b * 7.5)) / 11);

        System.out.printf("MEDIA = %.5f", c);
    }
}
