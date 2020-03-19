import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            do {
                n = (n * 3) + 1;
                System.out.println(n + " ");
            }
            while (n != 1);
        } else {
            do {
                System.out.println(n);
            }
            while (n != 1);

        }

    }
}