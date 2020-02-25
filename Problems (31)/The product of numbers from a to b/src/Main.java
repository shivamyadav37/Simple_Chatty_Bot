import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long counter= 0;
        long res = 0;
        for (long i =a ; i<b ; i++){
            //counter++;
            //b = i*b;
            res++;
            res = res*b;
            //res = i;
        }
        System.out.println(res);
    }

}