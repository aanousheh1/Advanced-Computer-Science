public class Cat0 { //Delete s from cats and lowercase p in public
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat0(String name, String breed ) { // Uppercase C and add a , String breed
		this.name = name; // add this.
		this.breed = breed; // add this.
		this.isHungry = true; // replace yes with true
		livesRemaining = 9;
	}

	public void setBreed(String breed) { // add this setter
		this.breed = breed;
	}

	public String getBreed() { // add getter
		return breed;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public String getName() { // change void to string
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsHungry(){ //Change void to boolean and capitalize H
		return isHungry;
	}

	public boolean feed() {
		this.isHungry = false;
        return false; // add return false;
	}

	public boolean equals(Cat0 other) {
		return this.name == other.name && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining; // add = sign
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."; // change system.out.println to return
	}
}