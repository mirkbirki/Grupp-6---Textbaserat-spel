import java.util.Arrays;

public class GoToCommand {

    public static void goToCommand(String input) {

        if (Arrays.asList(Main.areas).contains(input.toLowerCase())) {
            System.out.println("You journey to the " + input);
            Main.destination = input;

            if (Main.destination.equals("forest")) {
                System.out.println("Your destination is to the forest");
                if (!Main.hasEncounteredGoblin) {
                    System.out.println("As you step into the forest, a goblin jumps out from behind a tree!\nYou are forced to fight.");
                    Main.currentArea = input;
                    Main.hasEncounteredGoblin = true;
                    startBattle("goblin");
                } else {
                    System.out.println("You re-enter the forest. The goblin is gone, and the path ahead is clear.");
                }
            }

            boolean usedKey = false;
            if (Main.destination.equals("cemetery")) {
                if (Main.inventory.contains("cemetery key")) {
                    System.out.println("You use the rusty key to unlock the iron gates. You enter the desolate cemetery.");
                    Main.currentArea = input;
                    usedKey = true;
                }

                if (!usedKey) {
                    System.out.println("The iron gate is locked shut. You need a key to get in.");
                } else {
                    System.out.println("You enter the cemetery with open gates.");
                }
            }

            boolean foundRustyCoin = false;
            if (Main.destination.equals("sewers")) {
                Main.currentArea = "sewers";

                if (Main.inventory.contains("Rusty Coin")) {
                    System.out.println("You walk into the sewers and see a shiny object!");
                    System.out.println("It's a rusty coin. Rumor says it's worth 1000 coins!");
                    Main.inventory.add("Rusty Coin");
                    foundRustyCoin = true;
                }

                if (!foundRustyCoin) {
                    System.out.println("You are in the " + Main.currentArea);
                }

            }
        } else {
            System.out.println("Area does not exist, try again!");
        }
    }

    public static void startBattle(String enemyName) {
        System.out.println("You are now locked in battle against the " + enemyName + ". It has 10 health");
        System.out.println("You have 3 options flee, attack or defend.");

        int goblinHealth = 10;

        for (;;) {
            System.out.print("Enter option: ");
            String input = Main.input.nextLine();
            switch (input.toLowerCase()) {
                case "attack":
                    System.out.println("You attack the goblin and deal " + Main.damage);
                    goblinHealth -= Main.damage;

                    if (goblinHealth <= 0) {
                        System.out.println("You defeated the goblin! The goblin gave you coins to let him go.");
                        Main.coins += 100;
                        System.out.println("You now have " + Main.coins);
                        return;
                    } else {
                        System.out.println("The goblin attacked you and did 10 damage to you.");
                        Main.health -= 10;
                        System.out.println("Your health: " + Main.health);
                        System.out.println("Goblin health: " + goblinHealth);

                        if (Main.health <= 0) {
                            Main.gameOver = true;
                            return;
                        }
                    }
                    break;
                case "defend":
                    System.out.println("You defend the goblins attack and took less damage.");
                    int randomNum = (int)(Math.random() * 101); // Generates number between 0-100

                    // Basically 50% chance to block incoming attack
                    if (randomNum < 50) {
                        System.out.println("You took damage attempting to block.");
                        Main.health -= 10;
                        System.out.println("Your health: " + Main.health);
                        if (Main.health <= 0) {
                            Main.gameOver = true;
                            return;
                        }
                    } else {
                        System.out.println("You successfully blocked the attack. No damage was taken.");
                        System.out.println("Your health: " + Main.health);
                    }

                    break;
                case "flee":
                    System.out.println("You chose to flee.");
                    Main.currentArea = "Lobby";
                    System.out.println("You are now in the " + Main.currentArea);
                    System.out.println("Your health: " + Main.health);
                    Main.hasEncounteredGoblin = false;
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }
}
