
import java.util.Scanner;

public class Beec1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = ((a + b + Math.abs(a-b)) / 2);
        int fRes = ((c + res + Math.abs(c-res)) / 2);
        System.out.println(fRes + " eh o maior");
    }
}
