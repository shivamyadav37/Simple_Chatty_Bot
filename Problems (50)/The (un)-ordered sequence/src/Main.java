import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        String[] myStrArray = sc.nextLine().split(" ");
        String[] arrayWithoutZero = Arrays.copyOf(myStrArray, myStrArray.length + 1);
        boolean asc = false;
        boolean desc = false;

        for (String s : myStrArray) {
            System.out.print(s + " ");
        }

        // Check ascending
        for (int i = 0; i < myStrArray.length; i++) {

            if (Integer.parseInt(arrayWithoutZero[i]) >= Integer.parseInt(myStrArray[i + 1])) {
                asc = true;
            } else {
                asc = false;
                break;
            }
        }


        // Check descending
        for (int i = 0; i < myStrArray.length; i++) {
            if (Integer.parseInt(arrayWithoutZero[i]) <= Integer.parseInt(myStrArray[i + 1])) {
                desc = true;
            } else {
                desc = false;
                break;
            }
        }

        if (myStrArray.length <= 1) {
            System.out.println(true);
        } else if (asc || desc) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}