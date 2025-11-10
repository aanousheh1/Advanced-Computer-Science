public class Pool {
    private String name; 
    private String ownerName;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;
    private String username; 

    Pool(String name, String ownerName, int cleanlinessLevel) {
        this.ownerName = PoolUtils.fixName(ownerName);
        this.name = name;
        this.needsChemicalCheck = false;
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.username = PoolUtils.generateUsername(this.name);



    }


    Pool() {
        this.name = "John";
        this.ownerName = "Ruby";
        this.cleanlinessLevel = 4; 
        this.username = PoolUtils.generateUsername(this.name);
        this.needsChemicalCheck = true;
        
    }


    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public boolean needsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        if (needsChemicalCheck = true){
            return "== ABOUT " + name.toUpperCase() + " == \nName: " + name + "\nOwner: "
            + ownerName + "\nUsername: " + PoolUtils.generateUsername(name) + "\nCleanliness Level: "
            + cleanlinessLevel + "\nDoes pool need chemical check? Yes";

        } else {
            return "== ABOUT " + name.toUpperCase() + " == \nName: " + name + "\nOwner: "
            + ownerName + "\nUsername: " + PoolUtils.generateUsername(name) + "\nCleanliness Level: "
            + cleanlinessLevel + "\nDoes pool need chemical check? No";
        }
        


    }

    public boolean equals(Pool other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
            && this.cleanlinessLevel == other.cleanlinessLevel && this.username.equals(other.username)
            && this.needsChemicalCheck == other.needsChemicalCheck) {
                return true;
            } else {
                return false;
            }

    }

    

    


    
}
