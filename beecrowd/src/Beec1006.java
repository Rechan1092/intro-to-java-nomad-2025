
import java.util.Scanner;

public class Beec1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        System.out.printf("MEDIA = %.1f", ((a * 2) + (b * 3) + (c * 5)) /10);
    }
}
