import java.util.Scanner; // importing scanner from the standard library

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // an object for reading data

        int num1 = scanner.nextInt(); // read the first number
        int num2 = scanner.nextInt(); // read the second number
        int num3 = scanner.nextInt(); // read the third number
        int num4 = scanner.nextInt(); // read the fourth number


        System.out.println(num1); // print the first number
        System.out.println(num2); // print the second number
        System.out.println(num3); // print the third number
        System.out.println(num4); // print the fourth number
    }
}