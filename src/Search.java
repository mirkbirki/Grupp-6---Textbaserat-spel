public class Search {
    public static void searchCommand(String input) {

        switch (input.toLowerCase()) {

            case "forest":

                if (!Main.pouchFound) {
                    System.out.println("You found a pouch!");
                    Main.pouchFound = true;
                } else {
                    System.out.println("You already found the pouch here.");
                }
                break;

            case "cemetery":
                if (!Main.chestFound) {
                    System.out.println("You found a chest!");
                    Main.chestFound = true;
                } else {
                    System.out.println("You already found the chest here.");
                }
                break;

            case "sewers":
                if (!Main.boxFound) {
                    System.out.println("You found a box!");
                    Main.boxFound = true;
                } else {
                    System.out.println("You already found the box here.");
                }
                break;

            default:
                System.out.println("That is not a valid search command.");
                break;

        }
    }
}
