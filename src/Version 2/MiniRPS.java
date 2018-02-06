import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/** Mini Rock, Paper, Scissors Version 2 2/5/18 **/
public class MiniRPS {
    public static void main(String[] args) {
        String result;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean done = false;

        while(!done) {
            System.out.print("Mini RPS -- [R = 1, P = 2, S = 3  or Exit = 4]: ");
            try {
                int user = sc.nextInt();
                if(user > 4 || user < 0) {
                    System.out.print("Invalid Input..\n");
                } else if(user == 4) {
                    done = true;
                    System.out.println("Thank you for Playing!");
                } else {
                    int comp = rand.nextInt(3 + 1 - 1) + 1;

                    if((user - comp) == 1 || (comp - user) == 2) {
                        result = "Win!";
                    } else {
                        result = (user == comp) ? "Tie!" : "Lose!";
                    }
                    System.out.println(result + " U = " + user + " : C = " + comp);
                }
            } catch(InputMismatchException ex) {
                System.out.print("Invalid Input..\n");
            }
        }
    }
}