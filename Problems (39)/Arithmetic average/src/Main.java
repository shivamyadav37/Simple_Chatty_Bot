import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        //int n=0;
        //int arr[]= new int[];
        for(int n=a;n<b;n++){
            if (n%3==0){
                sum=sum+n;
            }
        }
        System.out.println(sum);

    }
}