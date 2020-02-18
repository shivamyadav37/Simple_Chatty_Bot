import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if ((A+B) >C){
            System.out.println("YES");
        }
        else if ((A+C)> B){
            System.out.println("YES");
        }
        else if ((B+C) > A){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}