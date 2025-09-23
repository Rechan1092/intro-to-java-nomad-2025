
import java.util.Scanner;

public class Beec1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double salary = sc.nextDouble();
        double sale = sc.nextDouble();
        System.out.printf("TOTAL = R$ %.2f", (salary + sale * 0.15));
    }
}
