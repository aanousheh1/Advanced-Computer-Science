public class Cat {
    private String name; 
    private String ownerName;
    private int moodLevel;
    private String catId; //1234
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.isHungry = true; 
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
    }

    public Cat() {
        name = "Toby";
        ownerName = "Samantha";
        moodLevel = 8;
        catId = "1924";
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return "" + catId + catChar;
    }

    public String toString() {
        String catMoodMessage = PurrfectUtils.determineCatMood(this);
        return "== ABOUT " + name.toUpperCase() + " == \n" + name + " is a cat.\nTheir tag is " 
            + generateCatTag() + ".\n" + catMoodMessage;
    }


    public boolean equals (Cat other) {
        if (this.name.equals(other.name) && this.catId.equals(other.catId) && this.catChar == other.catChar 
            && this.moodLevel == other.moodLevel && this.isHungry == other.isHungry && this.ownerName.equals(other.ownerName)) {
                return true;
            } else {
                return false;
            }
    }
    




    
}
