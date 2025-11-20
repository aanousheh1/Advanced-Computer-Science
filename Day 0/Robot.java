public class Robot {
    private boolean isFacingRight; 
    private int [] hallway;
    private int position; 



    public Robot(int [] hallway, int position) {
        this.position = position; 
        this.hallway = hallway; 
        this.isFacingRight = true;
    }



    public int [] getHallway() {
        return hallway;
    }



    public void setHallway(int [] hallway) {
        this.hallway = hallway;
    }



    public int getPosition() {
        return position;
    }



    public void setPosition(int position) {
        this.position = position;
    }



    public boolean isFacingRight() {
        return isFacingRight;
    }



    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public void displayState() {
        String state = "";
        for (int i = 0; i < hallway.length; i++) {
            state = state + hallway[i] + " ";
            
        }
        System.out.println(state);
        
        for (int i = 0; i <= position * 2; i++) {
            System.out.print(" ");

        }
        if (isFacingRight == true) {
            System.out.println(">");

        } else {
            System.out.println("<");
        }
        
    }

    public boolean isRobotBlockedByWall() {
        if (isFacingRight == false && position == 0) {
            return true;
        }
        if (isFacingRight == true && position == hallway.length - 1) {
            return true;
        }
        return false; 


    }

    


}
