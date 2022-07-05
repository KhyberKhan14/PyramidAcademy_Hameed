import com.dragon.game.CaveNotFoundException;

import java.util.Scanner;

public class Visitors extends SecondCave {

    public void entrance() throws Exception, CaveNotFoundException {
        String welcome = "Welcome to the Game of Dragons";
        String precaution = "Be careful there are two type of Dragons: "
                + "one type is friendly and they "
                + "share their treasure with you. "
                + "The second type is dangerous and they can eat you";
        System.out.println(welcome);
        System.out.println(precaution);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2");


        try {
            int cave = sc.nextInt();
            System.out.println(cave);
            if(cave == 1) {
                eaten();
            }else if(cave == 2) {
                congratulations();

            }else if(cave!=1 || cave!=2)

                throw new CaveNotFoundException("Cave not found Exception.");



        }
        catch(Exception e) {
            String s = e.getMessage();
            System.out.println(e + ": Wrong entry, try again.");
        }
    }

}
