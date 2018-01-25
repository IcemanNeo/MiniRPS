import java.util.Random;
import java.util.Scanner;

public class MiniRPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int user = 0;

        while(user != 4) {
            System.out.print("Mini RPS -- [R,P,S or (E)xit]: ");
            String input = sc.next().toLowerCase();
            int comp = rand.nextInt(3 + 1 - 1) + 1;

            if(input == "r") {
                user = 1;
            } else if(input == "p") {
                user = 2;
            } else if(input == "s") {
                user = 3;
            } else if(input == "e") {
                user = 4;
            } else {
                System.out.println("RPS - Invalid Input");
            }

            if (user > 0 && user < 4) {
                if (user == 1 && comp == 3) {
                    System.out.print("You Win! User = R -- Comp = S");
                } else if (user == 2 && comp == 1) {
                    System.out.print("You Win! User = P -- Comp = R");
                } else if (user == 3 && comp == 2) {
                    System.out.print("You Win! User = S -- Comp = P");
                } else if (user == comp) {
                    System.out.print("Tie!");
                    if(user == 1) {
                        System.out.print(" Both = R");
                    } else if(user == 2) {
                        System.out.print(" Both = P");
                    } else if(user == 3) {
                        System.out.print(" Both = S");
                    }
                } else {
                    System.out.print("You Lose!");
                    if(comp == 1) {
                        System.out.print(" User = S -- Comp = R");
                    } else if(comp == 2) {
                        System.out.print(" User = R -- Comp = P");
                    } else if(comp == 3) {
                        System.out.print(" User = P -- Comp = S");
                    }
                }
                System.out.print("\n\n");
            }
        }
        System.out.println("\nGame Over - Thank you!");
    }
}