public class Robot {
    private boolean isFacingRight; 
    private int [] hallway;
    private int position; 



    public Robot(int [] hallway, int position) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        if (position > hallway.length) {
            position = hallway.length - 1;
        }
        if (position < 0) {
            position = 0; 
        }
        this.position = position; 
        this.hallway = hallway; 
        this.isFacingRight = true;
    }



    public int [] getHallway() {
        return hallway;
    }



    public void setHallway(int [] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        this.hallway = hallway;
    }



    public int getPosition() {
        return position;
    }



    public void setPosition(int position) {
        if (position > hallway.length) {
            position = hallway.length - 1;
        }
        if (position < 0) {
            position = 0; 
        }
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

    public void move() {
        
        if (hallway[position] > 0) {
            hallway[position] = hallway[position] - 1;
            
        } 
        if (hallway[position] == 0) {
            if (isRobotBlockedByWall()) {
                isFacingRight = !isFacingRight;
            } else {
                if (isFacingRight) {
                    position += 1; 
                } else {
                    position -= 1;
                }
            }

        }
    
            

    
        for (int i = 0; i <= position * 2; i++) {
            System.out.print(" ");
        }
        if (isFacingRight) {
            System.out.print(">");
        } else {
            System.out.print("<");
        }
            
            
    
    }
        
        
    

    public boolean hallIsClear() {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;


    }

    public int clearHall() {
        int numMoves = 0;
        displayState();
        while (!hallIsClear()) {
            move();
            numMoves += 1;
        }

        return numMoves; 


    }


}

