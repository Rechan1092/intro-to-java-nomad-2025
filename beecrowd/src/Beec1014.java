
import java.util.Scanner;

public class Beec1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        System.out.printf("%.3f km/l", (x / y));
    }
}
