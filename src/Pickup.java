public class Pickup {
    public static void pickUpCommand(String input) {

        switch (input.toLowerCase()) {

            case "coins":

                if (!Main.pouchFound) {
                    Main.inventory.add("coins");
                    System.out.println("You picked up the coins!");

                } else if (Main.inventory.contains("coins")){
                    System.out.println("You have already picked up the coins!");
                }

                else {
                    System.out.println("You haven't found that object yet!");
                }
                break;

            case "gold":
                if (!Main.chestFound) {
                    System.out.println("You opened the chest and found gold!");
                    Main.inventory.add("gold");

                } else if (Main.inventory.contains("gold")) {
                    System.out.println("You have already picked up the gold.");
                }

                else {
                    System.out.println("You haven't found that object yet!");
                }
                break;

            case "diamonds":
                if (!Main.boxFound) {
                    System.out.println("You opened the box and found diamonds!");
                    Main.inventory.add("diamonds");
                } else if (Main.inventory.contains("diamonds")) {
                    System.out.println("You have already picked up the diamonds.");
                }

                else {
                    System.out.println("You haven't found that object yet!");
                }
                break;

            default:
                System.out.println("That is not a valid search command.");
                break;

        }
    }
}
