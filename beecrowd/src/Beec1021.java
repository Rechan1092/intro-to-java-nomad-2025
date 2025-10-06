import java.util.Scanner;

public class Beec1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        int cents = (int) Math.round(value * 100);

        int notas100 = cents / 10000;
        cents %= 10000;

        int notas50 = cents / 5000;
        cents %= 5000;

        int notas20 = cents / 2000;
        cents %= 2000;

        int notas10 = cents / 1000;
        cents %= 1000;

        int notas5 = cents / 500;
        cents %= 500;

        int notas2 = cents / 200;
        cents %= 200;

        int moedas1 = cents / 100;
        cents %= 100;

        int moedas050 = cents / 50;
        cents %= 50;

        int moedas025 = cents / 25;
        cents %= 25;

        int moedas010 = cents / 10;
        cents %= 10;

        int moedas005 = cents / 5;
        cents %= 5;

        int moedas001 = cents;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");
        System.out.println(moedas005 + " moeda(s) de R$ 0.05");
        System.out.println(moedas001 + " moeda(s) de R$ 0.01");
    }
}
