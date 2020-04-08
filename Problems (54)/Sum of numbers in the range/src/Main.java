import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        int m = from / to;
        int sum = m * (m + 1 / 2);
        int ans = from * sum;
        return ans;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}