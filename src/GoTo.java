import java.util.Arrays;

public class GoTo {
    public static void gotoCommand(String input) {

        if (Arrays.asList(Main.areas).contains(input)) {
            Main.currentArea = input;
            Help.help();
        } else {
            System.out.println("Area does not exist, try again!");
            Help.help();
        }

    }
}