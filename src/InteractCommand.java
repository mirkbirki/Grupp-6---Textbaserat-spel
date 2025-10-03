import java.util.Arrays;

public class InteractCommand {

    public static void interactCommand(String input, String currentArea) {
        String[] interactableObjects = {"pouch", "chest", "box"};

        if (!Arrays.asList(interactableObjects).contains(input)) {
            System.out.println("You can't interact with that.");
            return;
        }

        if (input.equals("pouch")) {
            if (!currentArea.equals("forest")) {
                System.out.println("There is no pouch here.");
            } else if (!Main.pouchFound) {
                System.out.println("You found a pouch!");
                Main.pouchFound = true;
            } else {
                System.out.println("The pouch has already been found.");
            }
        } else if (input.equals("chest")) {
            if (!currentArea.equals("cemetery")) {
                System.out.println("There is no chest here.");
            } else if (!Main.chestFound) {
                System.out.println("You found a chest!");
                Main.chestFound = true;
            } else {
                System.out.println("The chest has already been found.");
            }
        } else if (input.equals("box")) {
            if (!currentArea.equals("sewers")) {
                System.out.println("There is no box here.");
            } else if (!Main.boxFound) {
                System.out.println("You found a box!");
                Main.boxFound = true;
            } else {
                System.out.println("The box has already been found.");
            }
        }
    }
}
