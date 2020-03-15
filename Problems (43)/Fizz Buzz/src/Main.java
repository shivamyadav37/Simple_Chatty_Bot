// Java program to print Fizz Buzz
import java.util.*;
class FizzBuzz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // loop for 100 times
        for (int i=n; i<=m; i++)
        {
            if (i%15==0)
                System.out.println("FizzBuzz"+" ");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i%5==0)
                System.out.println("Buzz"+" ");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i%3==0)
                System.out.println("Fizz"+" ");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number

            else // print the numbers
                System.out.println(i+" ");
        }
    }
}
