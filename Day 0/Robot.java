public class Robot {
    private int hallway;
    private int position; 
    private boolean isFacingRight; 



    public Robot(int hallway, int position) {
        this.hallway = hallway; 
        this.position = position; 
        this.isFacingRight = true;
    }



    public int getHallway() {
        return hallway;
    }



    public void setHallway(int hallway) {
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
        
    }
    
}
