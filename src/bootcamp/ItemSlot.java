package bootcamp;

public class ItemSlot {
    private Item item;          // Store the actual Item object
    private int itemPrice;      // Price of the item
    private int quantityOfItem; // Quantity of the item in this slot

    // Constructor
    public ItemSlot(Item item, int itemPrice, int quantityOfItem) {
        this.item = item;
        this.itemPrice = itemPrice;
        this.quantityOfItem = quantityOfItem;
    }

    // Getters and setters
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Item: " + item + ", Price: $" + itemPrice + ", Quantity: " + quantityOfItem;
    }
}
