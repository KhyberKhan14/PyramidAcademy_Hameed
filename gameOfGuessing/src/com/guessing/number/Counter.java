package guessing.number;

import java.util.Scanner;

public class Counter {
    public void playAgain() {

        Scanner sc = new Scanner(System.in);
        String restart = "Would you like to play again?(y or n)";
        System.out.println(restart);

        try {
            String player = sc.nextLine();
            System.out.println(player);
            if (player.contains("y")) {

                System.out.println("Restarting!");
            } else if (player.contains("n")) {
                System.out.println("Game is over.");
            } else
                throw new Exception("");
        } catch (Exception e) {

        }
        sc.close();

    }
}