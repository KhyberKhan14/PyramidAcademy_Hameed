package com.genSpark.gameCounter;
import java.util.Scanner;
public class Counter {
    public void playAgain() {

        Scanner sc = new Scanner(System.in);
        String restart = "Would you like to play again?(y or n)";
        System.out.println(restart);

        String player=sc.nextLine();
        System.out.println(player);
        if(player.contains("y")) {

            System.out.println("Restarting!");
        }else if(player.contains("n")) {
            System.out.println("Process finshed with exit code 0.");

        }
        sc.close();
    }


}
