public class Rabbit extends Animal {
    private int speed;
    private int energy;

    public Rabbit() {
        super(3, true);
        this.speed = (int) (Math.random() * 10) + 1;
        this.energy = (int) (Math.random() * 10) + 1;
        super.setAge(5);
        super.setHungry(true);
    }

    public String escapePredator() {
        if (speed > 5 && energy > 5) {
            return "Rabbit escaped the predator";
        } else {
            return "Rabit did not escape the predator";
        }
    }

    public void makeNoise() {
        System.out.println("Rabbit Noise");
    }

    public void energyLevel() {
        if (escapePredator().equals("Rabbit escaped the predator")) {
            energy -= 3;

        } else {
            energy += 1;
        }
    }

}
