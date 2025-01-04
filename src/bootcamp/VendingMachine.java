package bootcamp;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, ItemSlot> slots; // Map to store slot locations and items

    // Constructor
    public VendingMachine() {
        this.slots = new HashMap<>();
    }

    // Getter for slots
    public Map<String, ItemSlot> getSlots() {
        return slots;
    }

    // Setter for slots
    public void setSlots(Map<String, ItemSlot> slots) {
        this.slots = slots;
    }

    // Add a new slot to the vending machine
    public void addSlot(String location, ItemSlot itemSlot) {
        slots.put(location, itemSlot);
    }

    // Get an item by location
    public ItemSlot getItem(String location) {
        return slots.get(location); // Retrieve the ItemSlot for the given location
    }

    // Describe the vending machine
    public void describe() {
        for (Map.Entry<String, ItemSlot> slot : slots.entrySet()) {
            String location = slot.getKey(); // Get the key (slot location)
            ItemSlot item = slot.getValue(); // Get the value (ItemSlot object)
            System.out.println("Location: " + location + " contains: " + item);
        }
    }
    public Return purchaseItem(double money, String location) {
        ItemSlot slot = slots.get(location); // Get the slot at the specified location

        if (slot == null) {
            // If the location does not exist
            return new Return(null, money);
        }

        if (money < slot.getItemPrice()) {
            // If not enough money is provided
            return new Return(null, money);
        }

        // If enough money, calculate change and return the item
        double change = money - slot.getItemPrice();
        Item item = slot.getItem(); // Get the Item object from the slot
        return new Return(item.toString(), change); // Use item's toString for the return
    }
}