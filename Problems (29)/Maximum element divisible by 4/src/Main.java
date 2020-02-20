import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int elements = scanner.nextInt();
        int i = 0;
        int counter = 0;
        for(i = 0 ; i <numberOfElements ; i++){
            if(elements %4== 0)
                counter++;

        }
    }

}