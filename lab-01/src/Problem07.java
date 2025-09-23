
public class Problem07 {
    public static void main(String[] args) {
        double result = 0;
        String minusOrPlus = "-";
        for (double i = 3; i <= 1000000000; i += 2) {
            if (minusOrPlus.equals("-")) {
                result += -(1/i);
                minusOrPlus = "+";
            } else {
                result += 1/i;
                minusOrPlus = "-";
            }
        }
        result += 1;
        System.out.println("PI = " + result * 4);

        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }
}