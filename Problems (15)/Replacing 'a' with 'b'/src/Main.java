import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str_new = str.replace('a','b');
        System.out.println(str_new);
    }
}