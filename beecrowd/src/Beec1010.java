
import  java.util.Scanner;

public class Beec1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        int x1 = sc.nextInt();
        double x2 = sc.nextDouble();

        sc.nextLine();
        int y1 = sc.nextInt();
        double y2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: %.2f", ((x1 * y2) + (x2 * y2)));
    }
}
