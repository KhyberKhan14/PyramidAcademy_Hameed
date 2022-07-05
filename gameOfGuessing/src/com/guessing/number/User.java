package guessing.number;

import java.util.Random;
import java.util.Scanner;

public class User extends Counter {
    public Object guessing() {

        String guess = "Guess a number.";

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Well," + name + ", I am thinking of number between 1 and 20");
        System.out.println(guess);


        int number = 0;
        int counter = 1;
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;

        try {
            while (counter <= 6 && number != n) {
                number = sc.nextInt();

                if (number > n) {
                    System.out.println("Your guess is too high. \n" + guess);
                    counter++;
                } else if (number < n) {
                    System.out.println("Your guess is too low. \n " + guess);
                    counter++;

                } else if (number == n) {
                    System.out.println("Good job," + name + " You guessed my number in " + counter + " guesses.");


                } else
                    throw new Exception("");
            }

        } catch (Exception e) {
            String s = ":  Invalid entery: game over.";
            System.out.println(e + s);
        }


        return "hameed";
    }
}