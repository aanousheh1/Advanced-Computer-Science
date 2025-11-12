import java.util.Scanner;
public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;

    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock")|| choice.equals("paper")|| choice.equals("scissors")) {
            return true; 
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        double a = (Math.random());
        if (a < 0.33) {
            return "rock";
        } else if ( a > 0.33 && a < 0.66) {
            return "scissors";
        } else {
            return "paper";
        }

    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        System.out.println("Enter choice: ");
        String choice = scan.nextLine();
        int attempts = 1;
        while (attempts < 3 && validateChoice(choice) == false) {
            System.out.println("Enter choice: ");
            choice = scan.nextLine();
            attempts++;
    
        }
    
        if (validateChoice(choice) == false) {
            setPlayerValues(name, generateRandomChoice());
        } else {
            setPlayerValues(name, choice);
        }
        
        scan.close();
    } 
    

    public boolean didPlayerWin() {
        String person = player.getChoice();
        String robot = opponent.getChoice();
        if (person.equals("rock") && robot.equals("scissors")) {
            return true;
        } else if (person.equals("paper") && robot.equals("rock")) {
            return true; 
        } else if (person.equals("scissors") && robot.equals("paper")) {
            return true;
        } else {
            return false; 
        }

    
    }
 
    public String toString() {
        String name = player.getName();
        if (didPlayerWin() == true) {
            return name + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        String name = player.getName();
        if (didPlayerWin() == true) {
            return "== GAME RESULTS ==\n" + name + " chose " + player.getChoice() + ".\nOpponent chose " + 
                opponent.getChoice() + ".\n" + name + " won!\nCongratulations!";
        } else {
            return "== GAME RESULTS ==\n" + name + " chose " + player.getChoice() + ".\nOpponent chose " + 
                opponent.getChoice() + ".\nOpponent won!\nCongratulations!";
        }

    }






    
}
