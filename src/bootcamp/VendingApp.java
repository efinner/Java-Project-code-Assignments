package bootcamp;

public class VendingApp {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        // Add items to the vending machine
        machine.addSlot("A1", new ItemSlot(new Item("Chips", "Sweet or salty snack"), 25, 5));
        machine.addSlot("B2", new ItemSlot(new Item("Soda", "Refreshing drink"), 50, 10));
        machine.addSlot("C3", new ItemSlot(new Item("Candy", "Delicious treat"), 14, 8));
        // Describe the vending machine
        System.out.println("Vending Machine Inventory:");
        machine.describe();

        // Simulate a purchase
        System.out.println("\nPurchasing an item:");
        Return purchase = machine.purchaseItem(30, "A1"); // Try to buy Chips at A1
        System.out.println(purchase);	

        // Simulate insufficient funds
        System.out.println("\nAttempting to purchase with insufficient money:");
        Return failedPurchase = machine.purchaseItem(10, "B2"); // Insufficient funds for Soda
        System.out.println(failedPurchase);
    }
}


//1. VendingMachine Class
//Purpose:
//This is the main class that handles the vending machine’s logic and functionality. It uses a Map to store the vending machine slots and methods for purchasing items and adding slots.
//
//What We Did:
//
//slots Field:
//We used a Map<String, ItemSlot> to represent the layout of the vending machine, where:
//
//The String key is the slot location (e.g., "A1").
//The ItemSlot value contains the details about the item in that slot.
//addSlot Method:
//Adds an ItemSlot to the machine. This lets you populate the vending machine with items.
//
//describe Method:
//Prints all the current slots in the vending machine along with their items, prices, and quantities.
//Why: Helps visualize the vending machine’s contents, useful for debugging.
//
//purchaseItem Method:
//Handles the logic for a purchase:
//
//Checks if the slot exists.
//Validates if enough money was provided.
//Calculates the change and returns a Return object containing the item and the change.
//2. ItemSlot Class
//Purpose:
//Represents an individual slot in the vending machine.
//
//What We Did:
//
//Fields:
//item: Stores the actual Item object.
//itemPrice: The price of the item in this slot.
//quantityOfItem: The number of items remaining in this slot.
//Methods:
//Constructor initializes the slot details.
//Getters and setters provide controlled access to the fields.
//toString gives a readable summary of the slot for the describe method in VendingMachine.
//Why:
//This class encapsulates all the details about a single vending machine slot. It keeps Item, price, and quantity organized and easy to manage.
//
//3. Item Class
//Purpose:
//Represents the details of an item in the vending machine.
//
//What We Did:
//
//Fields:
//item: The name of the item.
//description: A description of the item.
//Methods:
//Constructor initializes the name and description.
//Getters and setters provide controlled access.
//toString makes it easy to display item details in a readable format.
//Why:
//Separating Item into its own class makes it reusable and scalable. You can add more attributes (e.g., weight, dimensions) without affecting the VendingMachine or ItemSlot classes.
//
//4. Return Class
//Purpose:
//Represents what the vending machine gives back to the user after a purchase.
//
//What We Did:
//
//Fields:
//item: The Item object being returned (or null if insufficient funds).
//changeBack: The change to return to the user.
//Methods:
//Constructor initializes the fields.
//Getters and setters provide controlled access.
//toString displays the returned item and change in a readable format.
//Why:
//This class provides a structured way to return results from the vending machine's purchaseItem method. It keeps the logic clean and separates concerns.
//
//5. Putting It All Together:
//In the VendingApp class, we:
//
//Created a VendingMachine Object:
//The main object managing the vending machine.
//
//Added Slots to the Machine:
//Used the addSlot method to add ItemSlot objects.
//
//Described the Machine:
//Used the describe method to print out the vending machine’s contents.
//
//Simulated Purchases:
//Tested the purchaseItem method to handle:
//
//Successful purchases.
//Insufficient funds.
//
//
//



