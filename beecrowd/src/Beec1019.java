
import java.util.Scanner;

public class Beec1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;

        int hour = temp / 3600;
        temp -= hour * 3600;

        int minute = temp / 60;
        temp -= minute * 60;

        int second = temp;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
