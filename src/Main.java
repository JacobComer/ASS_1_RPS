import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        boolean again = false;
        String playerOne;
        String playerTwo;

        while(!again)
        {
            System.out.println("Enter P1 Choice(R,P,S): ");
            playerOne = userIn.nextLine();

            System.out.println("Enter P2 Choice(R,P,S): ");
            playerTwo = userIn.nextLine();

            switch(playerOne)
            {
                case "R":
                    switch (playerTwo)
                    {
                        case "R":
                            System.out.println("draw");
                            break;
                        case "P":
                            System.out.println("P2 wins!");
                            break;
                        case "S":
                            System.out.println("P1 wins!");
                            break;
                        default:
                            System.out.println("try again.");
                            break;
                    }
            }
            switch (playerOne)
            {
                case "P":
                    switch (playerTwo)
                    {
                        case "R":
                            System.out.println("P1 wins!");
                            break;
                        case "P":
                            System.out.println("draw");
                            break;
                        case "S":
                            System.out.println("P2 wins!");
                            break;
                        default:
                            System.out.println("try again");
                            break;
                    }
            }
            switch (playerOne)
            {
                case "S":
                    switch (playerTwo)
                    {
                        case "P":
                            System.out.println("P1 wins!");
                            break;
                        case "S":
                            System.out.println("draw");
                            break;
                        case "R":
                            System.out.println("P2 wins!");
                            break;
                        default :
                            System.out.println("try again");
                            break;
                    }
            }
            switch (playerOne)
            {
                case "":
                    switch (playerTwo)
                    {
                        case "":
                            System.out.println("try again.");
                            break;
                    }
            }
            System.out.println("Do you wan to play again [yes,no] ");
            String run = userIn.nextLine();
            if(run.equals("no"))
            {
                again = true;
            }
        }
    }
}