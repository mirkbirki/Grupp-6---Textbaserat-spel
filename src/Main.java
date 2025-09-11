import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //setup
    public static final Scanner input = new Scanner(System.in);
    public static String command = "";
    public static String object = "";
    public static String currentArea = "Lobby";
    public static Boolean gameOver = false;

    //game functions
    public static final String[] commands = {"goto", "search", "interact", "pickup", "help"};
    public static final String[] areas = {"forest", "cemetery", "sewers"};
    public static final String[] objects = {"switch", "chest"};
    public static final String[] items = {"sword", "shield"};

    public static void gotoCommand(String input) {

        if (Arrays.asList(areas).contains(input)) {
            System.out.println("You have entered: " + input);
            currentArea = input;
        } else {
            System.out.println("Area does not exist, try again!");
        }

        //todo
    }

    public static void searchCommand(String input) {
        //todo
    }

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

            System.out.println("Enter command:");

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
                gotoCommand(object);
            }

            if (command.equals(commands[4])) {
                Help.help();
            }


            //System.out.println("End of main line, loop next");


        } // spelet slut
        System.out.println("Game over");
    }

}
 