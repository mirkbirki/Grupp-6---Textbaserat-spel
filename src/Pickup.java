public class Pickup {
    public static void pickUpCommand(String item) {
        switch (item.toLowerCase()) {
            case "coins":
                if (Main.pouchInteracted && Main.currentArea.equals("forest")) {
                    if (!Main.inventory.contains("coins")) {
                        Main.inventory.add("coins");
                        System.out.println("You picked up the coins!");

                        // check win condition
                        if (Main.inventory.contains("coins") &&
                                Main.inventory.contains("gold") &&
                                Main.inventory.contains("diamonds")) {
                            Main.gameOver = true;
                        } else {
                            Help.helpAfterPickup();
                        }

                    } else {
                        System.out.println("You have already picked up the coins!");
                    }
                } else {
                    System.out.println("You can't pick up coins here.");
                }
                break;

            case "gold":
                if (Main.chestInteracted && Main.currentArea.equals("cemetery")) {
                    if (!Main.inventory.contains("gold")) {
                        Main.inventory.add("gold");
                        System.out.println("You picked up the gold!");

                        // check win condition
                        if (Main.inventory.contains("coins") &&
                                Main.inventory.contains("gold") &&
                                Main.inventory.contains("diamonds")) {
                            Main.gameOver = true;
                        } else {
                            Help.helpAfterPickup();
                        }

                    } else {
                        System.out.println("You have already picked up the gold!");
                    }
                } else {
                    System.out.println("You can't pick up gold here.");
                }
                break;

            case "diamonds":
                if (Main.boxInteracted && Main.currentArea.equals("sewers")) {
                    if (!Main.inventory.contains("diamonds")) {
                        Main.inventory.add("diamonds");
                        System.out.println("You picked up the diamonds!");

                        // check win condition
                        if (Main.inventory.contains("coins") &&
                                Main.inventory.contains("gold") &&
                                Main.inventory.contains("diamonds")) {
                            Main.gameOver = true;
                        } else {
                            Help.helpAfterPickup();
                        }

                    } else {
                        System.out.println("You have already picked up the diamonds!");
                    }
                } else {
                    System.out.println("You can't pick up diamonds here.");
                }
                break;

            default:
                System.out.println("That is not a valid pickup item.");
        }
    }
}
