import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%2;
        if(b == 0){
            a=a+2;
        }
        else {
            a=a+1;
        }
       System.out.println(a);
    }

}