import java.util.Scanner;

class Main {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();

        int countDivisibles(){
            // Variable to store the counter
            int counter = 0;

            // Running a loop from A to B and check
            // if a number is divisible by M.
            for (int i = A; i <= B; i++)
                if (i % M == 0)
                    counter++;

            return counter;
        }
    }
}