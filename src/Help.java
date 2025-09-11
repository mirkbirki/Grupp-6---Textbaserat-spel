import java.util.Arrays;

public class Help {

    public static void help() {
        switch (Main.currentArea) {

            case "forest":
            {
                System.out.println("You are in the: " + Main.areas[0]);
                System.out.println("Your command choices are: " + Arrays.toString(Main.commands));
                return;
            }
            case "cemetery":
            {
                System.out.println("You are in the: " + Main.areas[1]);
                System.out.println("Your command choices are: " + Arrays.toString(Main.commands));
                return;
            }
            case "sewers":
            {
                System.out.println("You are in the: " + Main.areas[2]);
                System.out.println("Your command choices are: " + Arrays.toString(Main.commands));
                return;
            }
            default:
            {
                System.out.println("You are in the: Lobby");
                System.out.println("Your command choices are: [goto]");
                System.out.println("Your selections are: " + Arrays.toString(Main.areas));
            }



        }

    }

}
