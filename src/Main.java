import java.util.Arrays;
import java.util.Scanner;

public class TextAdventure {


    //setup
    private static final Scanner input = new Scanner(System.in);
    private static String command = "";
    private static String object = "";
    private static String currentArea = "Lobby";
    private static Boolean gameOver = false;

    //game functions
    private static final String[] commands = {"goto", "search", "interact", "pickup", "help"};
    private static final String[] areas = {"forest", "cemetery", "sewers"};
    private static final String[] objects = {"switch", "chest"};
    private static final String[] items = {"sword", "shield"};

    private static void gotoCommand(String input) {

        if (Arrays.asList(areas).contains(input)) {
            System.out.println("You have entered: " + input);
            currentArea = input;
        } else {
            System.out.println("Area does not exist, try again!");
        }

        //todo
    }

    private static void searchCommand(String input) {
        //todo
    }

    private static void interactCommand(String input) {
        //todo
    }

    private static void pickupCommand(String input) {
        //todo
    }

    private static void helpCommand() {
        System.out.println("You are in the: " + currentArea);
        System.out.println("Your choices are: " + Arrays.toString(commands));

        //todo
    }

    public static void TextAdventure() {

        System.out.println("Welcome to: Spelnamn \n Make your choice: ");
        helpCommand();
        while (!gameOver) {

            System.out.println("Enter command:");

            String[] prompt = input.nextLine().trim().split(" ");

            if (prompt[0].isBlank()) continue;

            if (Arrays.asList(commands).contains(prompt[0])) {
                TextAdventure.command = prompt[0].toLowerCase();
            } else {
                System.out.println("Command does not exist, try again");
                continue;
            }

            if (prompt.length >= 2) {
                TextAdventure.object = prompt[1].toLowerCase();
            } else if (!prompt[0].contains(commands[4])) {
                System.out.println("Object does not exist, try again!");
                continue;
            }

            if (command.equals(commands[0])) { // goto -> areas
                gotoCommand(object);
            }

            if (command.equals(commands[4])) {
                helpCommand();
            }


            System.out.println("End of main line, loop next");


        } // spelet slut
        System.out.println("Game over");
    }

}
 