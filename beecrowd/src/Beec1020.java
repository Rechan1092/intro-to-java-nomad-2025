
import java.util.Scanner;

public class Beec1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int temp = n;

        int year = temp / 365;
        temp -= year * 365;
        System.out.println(year + " ano(s)");

        int month = temp / 30;
        temp -= month * 30;
        System.out.println(month + " mes(es)");

        int day = temp;
        System.out.printf(day + " dia(s)");
    }
}
