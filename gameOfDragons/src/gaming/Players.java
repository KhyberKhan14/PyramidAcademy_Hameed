package gaming;
import java.util.Scanner;
public class Players extends Cave2 {
    public void entrance() {
        String welcome = "Welcome to the Game of Dragons";
        String precaution = "Be careful there are two type of Dragons: one type is friendly and they "
                + "share their treasure with you. The second type is dangerous and they can eat you";
        System.out.println(welcome);
        System.out.println(precaution);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2 == 1) {
            eaten();
        }else if(a%2 == 0) {
            congratulations();
        }
        sc.close();


    }
}
