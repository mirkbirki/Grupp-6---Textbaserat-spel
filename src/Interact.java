public class Interact {
    public static void interactCommand(String object) {

        switch (object.toLowerCase()) {

            case "pouch":

                if (Main.pouchFound && Main.currentArea.equals("forest")) {
                    if (!Main.pouchInteracted) {
                        System.out.println("You opened the pouch and found coins!");
                        Main.pouchInteracted = true;
                        Help.help();
                    }
                    else {
                        System.out.println("You have already opened the pouch.");
                        Help.help();
                    }
                } else {
                    System.out.println("You haven't found the pouch here.");
                    Help.help();
                }
                break;

            case "chest":

                if (Main.chestFound  && Main.currentArea.equals("cemetery")) {
                    if (!Main.chestInteracted) {
                        System.out.println("You opened the chest and found gold!");
                        Main.chestInteracted = true;
                        Help.help();
                    }
                    else {
                        System.out.println("You have already opened the chest.");
                        Help.help();
                    }
                } else {
                    System.out.println("You haven't found the chest here.");
                    Help.help();
                }
                break;

            case "box":

                if (Main.boxFound  && Main.currentArea.equals("sewers")) {
                    if (!Main.boxInteracted) {
                        System.out.println("You opened the box and found diamonds!");
                        Main.boxInteracted = true;
                        Help.help();
                    }
                    else {
                        System.out.println("You have already opened the box.");
                        Help.help();
                    }
                } else {
                    System.out.println("You haven't found the box here.");
                    Help.help();
                }
                break;

            default:
                System.out.println("That is not a valid interact command.");
                Help.help();
                break;

        }
    }
}
