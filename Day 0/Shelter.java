import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        this.kennels = new Dog[rows][cols];

    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Dog can't be null");
        }
        int num = 0;
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                    num = num + 1;
                }
            }
        }
        if (num == 0) {
            System.out.println("No empty kennels.");
        }
    }

    public void add(Dog animal, int row, int col) {
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }

    }

    public void add(ArrayList<Dog> animals) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) == null) {
                throw new IllegalArgumentException("Can't be null");
            }

        }
        int index = 0;
        int num = 0;
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animals.get(index);
                    index++;
                    num++;
                }
            }
        }
        if (num == 0) {
            System.out.println("No empty kennels.");
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("Your an idiot");
        }
        Dog animal = kennels[row][col];
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == animal) {
                    kennels[r][c] = null;

                }
            }
        }

        return animal;

    }

    public ArrayList<Dog> search(String name) {
        if (name.equals(null)) {
            throw new IllegalArgumentException("Can't be null");
        }

        ArrayList<Dog> bob = new ArrayList<Dog>();
        int index = 0;
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                Dog animal = kennels[r][c];
                if (animal.getName().equals(name)) {
                    bob.set(index, kennels[r][c]);
                    index++;
                }
            }
        }

        return bob;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Can't be negative");
        }
        ArrayList<Dog> bob = new ArrayList<Dog>();
        int index = 0;
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                Dog animal = kennels[r][c];
                if (animal.getAge() == age) {
                    bob.set(index, kennels[r][c]);
                    index++;
                }
            }
        }

        return bob;
    }
}