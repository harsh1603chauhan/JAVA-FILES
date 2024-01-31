import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class rockPaperSci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int round = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < round; i++) {
            rpsGame(sc);
        }
    }

    static void rpsGame(Scanner sc) {
        System.out.println("You have 3 choices: \nRock \nPaper \nScissor");
        String userMove = sc.nextLine().toLowerCase();
        Random compCh = new Random();
        int rndN = compCh.nextInt(3);
        String compMove = "";

        if (rndN == 0) {
            compMove = "rock";
        } else if (rndN == 1) {
            compMove = "paper";
        } else if (rndN == 2) {
            compMove = "scissor";
        }

        System.out.println("Computer chose: " + compMove);

        if (userMove.equals(compMove)) {
            System.out.println("It's a Draw! Try Again!");
        } else if (pWin(userMove, compMove)) {
            System.out.println("Player Wins!");
        } else {
            System.out.println("Computer Wins!");
        }
    }

    static boolean pWin(String userMove, String compMove) {
        if (userMove.equals("rock")) {
            return compMove.equals("scissor");
        } else if (userMove.equals("paper")) {
            return compMove.equals("rock");
        } else {
            return compMove.equals("paper");
        }
    }
}

