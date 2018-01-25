import java.util.Random;
import java.util.Scanner;

public class MiniRPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int user = 0;

        while(user != 4) {
            System.out.print("Mini RPS -- [R,P,S or (E)xit]: ");

            switch(sc.next().toLowerCase()) {
                case "r": user = 1; break;
                case "p": user = 2; break;
                case "s": user = 3; break;
                case "e": user = 4; break;
                default: user = 0; System.out.println("Invalid Input.."); break;
            }

            if (user > 0 && user < 4) {
                int comp = rand.nextInt(3 + 1 - 1) + 1;
                if (user == 1 && comp == 3) {
                    System.out.print("You Win! User = R -- Comp = S");
                } else if (user == 2 && comp == 1) {
                    System.out.print("You Win! User = P -- Comp = R");
                } else if (user == 3 && comp == 2) {
                    System.out.print("You Win! User = S -- Comp = P");
                } else if (user == comp) {
                    switch(user) {
                        case 1: System.out.print("Tie! Both = R"); break;
                        case 2: System.out.print("Tie! Both = P"); break;
                        case 3: System.out.print("Tie! Both = S"); break;
                    }
                } else {
                    switch(comp) {
                        case 1: System.out.print("You Lose! User = S -- Comp = R"); break;
                        case 2: System.out.print("You Lose! User = R -- Comp = P"); break;
                        case 3: System.out.print("You Lose! User = P -- Comp = S"); break;
                    }
                }
                System.out.print("\n\n");
            }
        }
        System.out.println("\nGame Over - Thank you!");
    }
}