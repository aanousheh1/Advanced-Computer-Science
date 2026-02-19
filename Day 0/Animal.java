public abstract class Animal {
    private int age;
    private boolean isHungry;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public Animal(int age, boolean isHungry) {
        this.age = age;
        this.isHungry = isHungry;
    }

    public void getOlder() {
        age++;
    }

    public void eat() {
        isHungry = false;
    }

    public abstract void makeNoise();

}
