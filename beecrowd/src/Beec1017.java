
import java.util.Scanner;

public class Beec1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int speed = sc.nextInt();
        System.out.printf("%.3f", (speed / 12.0 * time));
    }
}
