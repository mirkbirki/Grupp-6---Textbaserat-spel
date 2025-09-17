public class Inventory {
    public static void inventoryCommand() {

        if (Main.inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        }

        else {
            System.out.println("You are carrying: " + Main.inventory);
        }

    }
}
