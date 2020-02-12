import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String greet = sc.nextLine(); // read first String
        String lang = sc.nextLine(); // read second String
        int num1 = sc.nextInt(); // read the first number
        int num2 = sc.nextInt(); // read the second number

        System.out.println(greet);
        System.out.println(lang);
        System.out.println(num1);
        System.out.println(num2);

    }
}