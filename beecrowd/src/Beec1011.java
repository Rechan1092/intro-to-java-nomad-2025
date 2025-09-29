
import  java.util.Scanner;

public class Beec1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =  sc.nextInt();
        System.out.printf("VOLUME = %.3f", (4.0/3) * Math.PI * x * x * x);
    }
}
