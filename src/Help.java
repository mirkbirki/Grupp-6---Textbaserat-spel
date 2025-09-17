import java.util.Arrays;

public class Help {

    public static void help() {
        switch (Main.currentArea.toLowerCase()) {

            case "forest":

            {
                System.out.println("You are in the: " + Main.areas[0]);
                System.out.println("Your command choices are: " + Arrays.toString(Main.commands));

                if (!Main.pouchFound) {
                    System.out.println("Usage: search forest");
                } else if (!Main.pouchInteracted) {
                    System.out.println("Usage: interact pouch");
                } else if (!Main.inventory.contains("coins")) {
                    System.out.println("Usage: pickup coins");
                }
                else {
                    System.out.println("You’ve already cleared this area.");
                }
                return;
            }

            case "cemetery":

            {
                System.out.println("You are in the: " + Main.areas[1]);
                System.out.println("Your command choices are: " + Arrays.toString(Main.commands));

                if (!Main.chestFound) {
                    System.out.println("Usage: search cemetery");
                } else if (!Main.chestInteracted) {
                    System.out.println("Usage: interact chest");
                } else if (!Main.inventory.contains("gold")) {
                    System.out.println("Usage: pickup gold");
                } else {
                    System.out.println("You’ve already cleared this area.");
                }
                return;
            }

            case "sewers":

            {
                System.out.println("You are in the: " + Main.areas[2]);
                System.out.println("Your command choices are: " + Arrays.toString(Main.commands));

                if (!Main.boxFound) {
                    System.out.println("Usage: search sewers");
                } else if (!Main.boxInteracted) {
                    System.out.println("Usage: interact box");
                } else if (!Main.inventory.contains("diamonds")) {
                    System.out.println("Usage: pickup diamonds");
                } else {
                    System.out.println("You’ve already cleared this area.");
                }
                return;
            }

            default:

            {
                System.out.println("You are in the: Lobby");
                System.out.println("Your command choices are: [goto]");
                System.out.println("Your selections are: " + Arrays.toString(Main.areas));
                System.out.println("Usage: goto forest/cemetery/sewers");
            }

        }
    }

    public static void helpAfterPickup() {
        switch (Main.currentArea.toLowerCase()) {
            case "forest":
                System.out.println("Tip: You can check 'inventory' or move on with 'goto cemetery' / 'goto sewers'.");
                break;
            case "cemetery":
                System.out.println("Tip: You can check 'inventory' or move on with 'goto forest' / 'goto sewers'.");
                break;
            case "sewers":
                System.out.println("Tip: You can check 'inventory' or move on with 'goto forest' / 'goto cemetery'.");
                break;
            default:
                System.out.println("Tip: type 'inventory' or 'help'.");
        }
    }

}
