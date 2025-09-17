import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //setup
    public static final Scanner input = new Scanner(System.in);
    public static String command = "";
    public static String object = "";
    public static String currentArea = "Lobby";
    public static Boolean gameOver = false;
    static boolean pouchFound = false;
    static boolean chestFound = false;
    static boolean boxFound = false;
    static boolean pouchInteracted = false;
    static boolean chestInteracted = false;
    static boolean boxInteracted = false;
    static ArrayList<String> inventory = new ArrayList<>();

    //game functions
    public static final String[] commands = {"goto", "search", "interact", "pickup", "inventory", "help"};
    public static final String[] areas = {"forest", "cemetery", "sewers"};
    public static final String[] objects = {"pouch", "chest", "box"};
    public static final String[] items = {"coins", "gold", "diamonds"};

    public static void main(String[] args) {

        System.out.println("Welcome to: Text Adventure!" + "\nMake your choice: ");
        Help.help();

        while (!gameOver) {

            System.out.println("Enter command:");

            String[] parts = input.nextLine().trim().split("\\s+");
            if (parts.length == 0 || parts[0].isBlank()) continue;

            String cmd = parts[0].toLowerCase();

            if (Arrays.asList(commands).contains(cmd)) {
                command = cmd;
            }

            else {
                System.out.println("Command does not exist, try again");
                continue;
            }

            if (parts.length >= 2) {
                object = parts[1].toLowerCase();
            } else if (!command.equals("help") && !command.equals("inventory")) {
                System.out.println("Object does not exist, try again!");
                continue;
            }

            switch (command) {
                case "goto":
                    GoTo.gotoCommand(object);
                    break;
                case "search":
                    Search.searchCommand(currentArea);
                    break;
                case "interact":
                    Interact.interactCommand(object);
                    break;
                case "pickup":
                    Pickup.pickUpCommand(object);
                    break;
                case "inventory":
                    Inventory.inventoryCommand();
                    break;
                case "help":
                    Help.help();
                    break;
            }

            if (Main.inventory.contains("coins") &&
                    Main.inventory.contains("gold") &&
                    Main.inventory.contains("diamonds")) {

                System.out.println("\nCongratulations! You found all the treasures!");
                gameOver = true;
            }

        }

        System.out.println("Game over.");

    }

}











