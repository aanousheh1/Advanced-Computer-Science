public class Opossum extends Animal {
    private int fearFactor;
    private int temperature;
    private int energy;
    private String furType;
    private int age;

    public Opossum(String furType, int energy, int temperature, int fearFactor) {
        super(2, true);
        this.furType = furType;
        this.energy = energy;
        this.temperature = temperature;
        this.fearFactor = fearFactor;

    }

    public void getOlder() {
        age++;
    }

    public int getEnergy() {
        return energy;
    }

    public String getFurType() {
        return furType;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getFearFactor() {
        return fearFactor;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setFearFactor(int fearFactor) {
        this.fearFactor = fearFactor;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String playDead() {
        if (fearFactor >= 6) {
            return "Opossum is playing dead";
        } else {
            return "Opossum is not scared right now";
        }

    }

    public void makeNoise() {
        System.out.println("Opossum Noise");
    }

}
