public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice.toLowerCase()) == true) {
            this.choice = choice.toLowerCase();
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }


    public String toString() {
        return "Opponent chose " + choice + ".";
    }

    
}
