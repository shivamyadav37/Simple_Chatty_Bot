import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        String[] myStrArray = sc.nextLine().split(" ");
        String[] arrayWithoutZero = Arrays.copyOf(myStrArray, myStrArray.length - 1);
        boolean asc = false;
        boolean desc = false;

        //for (String s : arrayWithoutZero) {
        //  System.out.print(s + " ");
        //}

        // Check ascending
        for (int i = 0; i < arrayWithoutZero.length; i++) {
            if (Integer.parseInt(arrayWithoutZero[i]) >= Integer.parseInt(arrayWithoutZero[i + 1])) {
                asc = true;
                break;
            } else {
                asc = false;
                break;
            }
        }


        // Check descending
        for (int i = 0; i < arrayWithoutZero.length; i++) {
            if (Integer.parseInt(arrayWithoutZero[i]) <= Integer.parseInt(arrayWithoutZero[i + 1])) {
                desc = true;
                break;
            } else {
                desc = false;
                break;
            }
        }

        if (arrayWithoutZero.length <= 1) {
            System.out.println(true);
        } else if (asc || desc) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}