public class Search {
    public static void searchCommand(String area) {

        switch (area.toLowerCase()) {

            case "forest":

                if (!Main.pouchFound) {
                    System.out.println("You found a pouch!");
                    Main.pouchFound = true;
                    Help.help();
                } else {
                    System.out.println("You already found the pouch here.");
                    Help.help();
                }
                break;

            case "cemetery":
                if (!Main.chestFound) {
                    System.out.println("You found a chest!");
                    Main.chestFound = true;
                    Help.help();
                } else {
                    System.out.println("You already found the chest here.");
                    Help.help();
                }
                break;

            case "sewers":
                if (!Main.boxFound) {
                    System.out.println("You found a box!");
                    Main.boxFound = true;
                    Help.help();
                } else {
                    System.out.println("You already found the box here.");
                    Help.help();
                }
                break;

            default:
                System.out.println("That is not a valid search command.");
                Help.help();
                break;

        }
    }
}
