import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1.replace(" ", "").equalsIgnoreCase(str2.replace(" ", ""))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}