package com.genSpark.gameCounter;
import java.util.Random;
import java.util.Scanner;
public class User extends Counter {
    public void guessing() {
        String guess = "Take a guess";
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


            }

        }
    }
}


