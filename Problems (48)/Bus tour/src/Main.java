import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numberOfBridges = sc.nextInt();
        int counter = 0;
        while (true) {
            int heightsOfBridges = sc.nextInt();
            counter++;
            if (counter == numberOfBridges) {
                break;
            } else {
                System.out.println(heightsOfBridges);
            }
        }

    }
}