package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Veronica.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");

        // reading a name
        Scanner s = new Scanner(System.in);
        String Username = s.nextLine();
        System.out.println("What a great name you have," +Username +"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders

        System.out.println("Your age is {yourAge}; that's a good time to start programming!");
    }
}
