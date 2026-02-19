public class Dog1 {

    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog1(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public Dog1() {
        name = "Max";
        ownerName = "Rob";
        age = 6;
        dogId = 456;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        char newChar = PawesomeUtils.generateDogChar(this.dogId);
        setDogChar(newChar);
        String newTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        setDogTag(newTag);
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);

    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        if (stillInFacility = true) {
            return name + " is a good dog. They are  " + age + " years old and belong to " + ownerName
                    + ". They are currently in our facility.  For employee use only: DogTag is " + dogTag + ".";
        } else {
            return name + " is a good dog. They are  " + age + " years old and belong to "
                    + ownerName + ". They are currently not in our facility. For employee use only: DogTag is " + dogTag
                    + ".";
        }
    }

    public boolean equals(Dog1 other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
                && this.age == other.age && this.dogTag.equals(other.dogTag)
                && this.stillInFacility == other.stillInFacility) {
            return true;
        } else {
            return false;
        }
    }

}
