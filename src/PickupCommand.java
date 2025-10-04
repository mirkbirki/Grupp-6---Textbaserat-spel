public class PickupCommand {

    public static void pickup(String object) {
        switch (object.toLowerCase()) {
            case "pouch":
                if (!Main.pouchFound) {
                    System.out.println("You haven't found the pouch yet. Try searching first");
                    return;
                }
                if (!Main.inventory.contains("coins")) {
                    System.out.println("You pick up the pouch from the ground and search it:");
                    System.out.println("You found 10 coins inside and added them to your inventory!");
                    Main.inventory.add("coins");
                    Main.coins += 10;
                } else {
                    System.out.println("The pouch is empty...");
                }
                break;

            case "chest":
                if (!Main.chestFound) {
                    System.out.println("You haven't found the chest yet. Try searching first");
                    return;
                }
                if (!Main.inventory.contains("gold")) {
                    System.out.println("You open the chest and find some gold!");
                    Main.inventory.add("gold");
                } else {
                    System.out.println("The chest is empty...");
                }
                break;

            case "box":
                if (!Main.boxFound) {
                    System.out.println("You haven't found the box yet. Try searching first.");
                    return;
                }
                if (!Main.inventory.contains("diamonds")) {
                    System.out.println("You open the box and find some diamonds!");
                    Main.inventory.add("diamonds");
                } else {
                    System.out.println("The box is empty...");
                }
                break;

            default:
                System.out.println("You can't pick that up!");
                break;
        }
    }


/*
Ett sätt att lösa det hela från main med pickupcommand
Jag anser dock att ansvaret för pickup ska hanteras i "interact" då användaren borde få välja där och då.
Därav två alternativ. ta bort kommentarerna och kommentera om vissa områden i pickupcommand & interactcommand
samt lägg till ett nytt case i Main för pickupcommand.

*/

//    public static void PickupCommand(String input) {
//        switch (input.toLowerCase()) {
//            case "pouch":
//                if (Main.pouchFound) {
//                    if (!Main.inventory.contains("coins")) {
//                        System.out.println("You pick up the pouch from the ground and search it: ");
//                        System.out.println("You found 10 coins inside and added it to your inventory!");
//                        Main.inventory.add("coins");
//                        Main.coins += 10;
//                    } else {
//                        System.out.println("You already found the pouch!");
//                    }
//                } else {
//                    System.out.println("There is no pouch on the ground");
//                }
//                break;
//
//            case "chest":
//                if (Main.chestFound) {
//                    if (!Main.inventory.contains("gold")) {
//                        System.out.println("You kneel in front of the chest and open it: ");
//                        System.out.println("You found some gold inside and added it to your inventory!");
//                        Main.inventory.add("gold");
//                    } else {
//                        System.out.println("You already found the chest!");
//                    }
//                }
//                break;
//
//            case "box":
//                if (Main.boxFound) {
//                    if (!Main.inventory.contains("diamonds")) {
//                        System.out.println("You pick up the box from the ground and search it: ");
//                        System.out.println("You found some diamonds inside and added it to your inventory!");
//                        Main.inventory.add("diamonds");
//                    } else {
//                        System.out.println("You already found the box!");
//                    }
//                }
//                break;
//            default:
//                System.out.println("You can't pick that up!");
//                break;
//        }
//    }
}
