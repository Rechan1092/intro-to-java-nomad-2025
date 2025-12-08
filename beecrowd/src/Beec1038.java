import java.io.IOException;
import java.util.Scanner;
public class Beec1038 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        if (a == 1) {
            System.out.printf("Total: R$ %.2f\n", (b * 4));
        } else if (a == 2) {
            System.out.printf("Total: R$ %.2f\n", (b * 4.5));
        } else if (a == 3) {
            System.out.printf("Total: R$ %.2f\n", (b * 5));
        } else if (a == 4) {
            System.out.printf("Total: R$ %.2f\n", (b * 2));
        } else if (a == 5) {
            System.out.printf("Total: R$ %.2f\n", (b * 1.5));
        }
    }

}