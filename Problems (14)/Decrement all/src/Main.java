import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        a=a-1;
        b=b-1;
        c=c-1;
        d=d-1;
        System.out.println(a + " " + b + " " + c + " "+ d);
    }
}