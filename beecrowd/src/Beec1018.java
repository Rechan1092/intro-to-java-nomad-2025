
import java.util.Scanner;

public class Beec1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n);

        int temp = n;

        int hundred = temp / 100;
        temp -= hundred * 100;
        System.out.println(hundred + " nota(s) de R$ 100,00");

        int fifty = temp / 50;
        temp -= fifty * 50;
        System.out.println(fifty + " nota(s) de R$ 50,00");

        int twenty = temp / 20;
        temp -= twenty * 20;
        System.out.println(twenty + " nota(s) de R$ 20,00");

        int ten = temp / 10;
        temp -= ten * 10;
        System.out.println(ten + " nota(s) de R$ 10,00");

        int five = temp / 5;
        temp -= five * 5;
        System.out.println(five + " nota(s) de R$ 5,00");

        int two = temp / 2;
        temp -= two * 2;
        System.out.println(two + " nota(s) de R$ 2,00");

        int one = temp;
        System.out.println(one + " nota(s) de R$ 1,00");
    }
}
