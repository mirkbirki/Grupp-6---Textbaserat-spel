import java.util.ArrayList;
import java.util.Arrays;
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

    //game functions
    public static final String[] commands = {"goto", "search", "interact", "pickup", "help"};
    public static final String[] areas = {"forest", "cemetery", "sewers"};
    public static final String[] objects = {"pouch", "chest", "box"};
    public static final String[] items = {"coins", "gold", "diamonds"};
    public static String destination = "";
    public static boolean hasEncounteredGoblin = false;

    //Player
    public static ArrayList<String> inventory = new ArrayList<>();
    public static int health = 100;
    public static int damage = 5;
    public static int coins = 0;

    public static void interactCommand(String input) {
        //todo
    }

    public static void pickupCommand(String input) {
        //todo
    }


    public static void main(String[] args) {

        System.out.println("Welcome to: Spelnamn \n Make your choice: ");
        Help.help();
        while (!gameOver) {

            System.out.print("Enter command: ");

            String[] prompt = input.nextLine().trim().split(" ");

            if (prompt[0].isBlank()) continue;

            if (Arrays.asList(commands).contains(prompt[0])) {
                command = prompt[0].toLowerCase();
            } else {
                System.out.println("Command does not exist, try again");
                continue;
            }

            if (prompt.length >= 2) {
                object = prompt[1].toLowerCase();
            } else if (!prompt[0].contains(commands[4])) {
                System.out.println("Object does not exist, try again!");
                continue;
            }

            if (command.equals(commands[0])) { // goto -> areas
                GoToCommand.goToCommand(object);
            }

            if (command.equals(commands[1]))
                Search.searchCommand(currentArea);
            }
            
            if (command.equals(commands[2]))
                InteractCommand.interactCommand(object, currentArea);
            }
    
            if (command.equals(commands[4])) {
                Help.help();
            }

            //System.out.println("End of main line, loop next");

        } // spelet slut
        System.out.println("Game over");
    }

}











