public class Interact {
    public static void interactCommand(String input) {

        switch (input.toLowerCase()) {

            case "pouch":

                if (!Main.pouchFound && Main.currentArea == "forest") {
                    System.out.println("You opened the pouch and found coins!");
                    Main.pouchFound = true;
                } else {
                    System.out.println("You haven't found the object yet.");
                }
                break;

            case "chest":
                if (!Main.chestFound  && Main.currentArea == "cemetery") {
                    System.out.println("You opened the chest and found gold!");
                    Main.chestFound = true;
                } else {
                    System.out.println("You haven't found the object yet.");
                }
                break;

            case "box":
                if (!Main.boxFound  && Main.currentArea == "sewers") {
                    System.out.println("You opened the box and found diamonds!");
                    Main.boxFound = true;
                } else {
                    System.out.println("You haven't found the object yet.");
                }
                break;

            default:
                System.out.println("That is not a valid search command.");
                break;

        }
    }
}
