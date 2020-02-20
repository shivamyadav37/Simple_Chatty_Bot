import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter= 0;
        int res = 0;
        for (int i =a ; i<b ; i++){
            //counter++;
            res = res*b;
            //res = i;
        }
        System.out.println(res);
    }

}