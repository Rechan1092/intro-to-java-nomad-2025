public class Problem13 {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        double denominator = a * d - b * c;
        double x = (e * d - b * f) /  denominator;
        double y = (a * f - e * c) /  denominator;
        System.out.printf("x: %.3f", x);
        System.out.printf("y: %.3f", y);
    }
}
