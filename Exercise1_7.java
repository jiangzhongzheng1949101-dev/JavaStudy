/**
 * Exercise 1.7: Approximate pi with two Leibniz-series expressions.
 */
public class Exercise1_7 {
    public static void main(String[] args) {
        double firstApproximation = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7
                + 1.0 / 9 - 1.0 / 11);
        double secondApproximation = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7
                + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);

        System.out.println("First approximation: " + firstApproximation);
        System.out.println("Second approximation: " + secondApproximation);
    }
}
