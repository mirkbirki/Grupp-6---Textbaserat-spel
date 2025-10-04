import java.util.Scanner;

public class InteractCommand {

    // Kommentera ut om så önskas, pickup kommer inte längre fungera.
    // Skrev om för att kunna passera Pickup korrekt och dela upp ansvaret tydligare då search hittar även objekten.
    private static final Scanner scanner = new Scanner(System.in);

    public static void interactCommand(String input, String currentArea) {

        if (!java.util.Arrays.asList(Main.objects).contains(input)) {
            System.out.println("You can't interact with that.");
            return;
        }

        boolean inCorrectArea = false;
        switch (input) {
            case "pouch":
                inCorrectArea = currentArea.equals("forest");
                break;
            case "chest":
                inCorrectArea = currentArea.equals("cemetery");
                break;
            case "box":
                inCorrectArea = currentArea.equals("sewers");
                break;
        }

        if (!inCorrectArea) {
            System.out.println("There is no " + input + " here.");
            return;
        }

        System.out.println("You see the " + input + ". Do you want to pick it up? (yes/no)");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("yes") || answer.equals("y")) {
            PickupCommand.pickup(input);
        } else {
            System.out.println("You decided to leave the " + input + " for now.");
        }
    }

    /*
    Hugos kod, fungerar men ansvaret stämmer inte riktigt.
    SearchCommand ska hitta objekten, interact ska ge användaren val kring vad som ska ske om jag tänker rätt?
    - Joel
     */

//    public static void interactCommand(String input, String currentArea) {
//        String[] interactableObjects = {"pouch", "chest", "box"};
//
//        if (!Arrays.asList(interactableObjects).contains(input)) {
//            System.out.println("You can't interact with that.");
//            return;
//        }
//
//        if (input.equals("pouch")) {
//            if (!currentArea.equals("forest")) {
//                System.out.println("There is no pouch here.");
//            } else if (!Main.pouchFound) {
//                System.out.println("You found a pouch!");
//                Main.pouchFound = true;
//            } else {
//                System.out.println("The pouch has already been found.");
//            }
//        } else if (input.equals("chest")) {
//            if (!currentArea.equals("cemetery")) {
//                System.out.println("There is no chest here.");
//            } else if (!Main.chestFound) {
//                System.out.println("You found a chest!");
//                Main.chestFound = true;
//            } else {
//                System.out.println("The chest has already been found.");
//            }
//        } else if (input.equals("box")) {
//            if (!currentArea.equals("sewers")) {
//                System.out.println("There is no box here.");
//            } else if (!Main.boxFound) {
//                System.out.println("You found a box!");
//                Main.boxFound = true;
//            } else {
//                System.out.println("The box has already been found.");
//            }
//        }
//    }
}
