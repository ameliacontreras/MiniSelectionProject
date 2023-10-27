import java.util.Scanner;
public class PaperScissorsRock {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Rock (0), Paper (1), Scissors (2): ");
        int player = scan.nextInt();
        int computer = (int)(Math.random()*3);
        if (player == 0)
        {
            System.out.println("You played rock");
        }
        if (player == 1)
        {
            System.out.println("You played paper");
        }
        if (player == 2)
        {
            System.out.println("You played scissors");
        }
        if (computer == 0)
        {
            System.out.println("Computer played rock");
        }
        if (computer == 1)
        {
            System.out.println("Computer played paper");
        }
        if (computer == 2)
        {
            System.out.println("Computer played scissors");
        }
        if (computer == player)
        {
            System.out.println("\nIt is a draw!");
        }
        if (computer == 0 && player == 1)
        {
            System.out.println("\nPaper beats rock, you win!");
        }
        if (computer == 0 && player == 2)
        {
            System.out.println("\nRock beats scissors, the computer wins!");
        }
        if (computer == 1 && player == 0)
        {
            System.out.println("\nPaper beats rock, the computer wins!");
        }
        if (computer == 2 && player == 0)
        {
            System.out.println("\nRock beats scissors, you win!");
        }
        if (computer == 1 && player == 2)
        {
            System.out.println("\nScissors beats paper, you win!");
        }
        if (computer == 2 && player == 1)
        {
            System.out.println("\nScissors beats paper, the computer wins!");
        }
    }
}
