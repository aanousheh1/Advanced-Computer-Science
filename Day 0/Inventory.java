public class Inventory {
    private String itemName;
    private int quantity;
    private int price; 

    public Inventory(String itemName, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;

    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Item: " + itemName + ", Quanitity: " + quantity + ", Price: $" + price;
    }

    public boolean equals(Inventory other) {
        if (this.itemName.equals(other.itemName) && this.price == other. price && this.quantity == other.quantity) {
            return true;
        } else {
            return false;
        }
    }

    public void raisePrice(int price) {
        double percentage = (int) (Math.random() * 100);
        price = ((int) percentage + price);


    }


}
