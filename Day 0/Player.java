public class Player {
    private String name; 
    private String choice; 

    public String getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice.toLowerCase()) == true) {
            this.choice = choice.toLowerCase();
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
    
}
