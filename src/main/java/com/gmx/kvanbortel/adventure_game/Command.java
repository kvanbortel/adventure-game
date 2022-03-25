package com.gmx.kvanbortel.adventure_game;

public class Command {
    public static void parseShowCommand(String[] args, SaveData saveData) {
        if (!checkArgCount(args, 2, 3))
            return;
        if (args[1].equals("username")) {
            System.out.println(saveData.getUsername());
        } else {
            System.out.printf("Invalid argument '%s'%n", args[1]);
        }
    }

    public static boolean parseQuitCommand(String[] args) {
        if (!checkArgCount(args, 1, 2))
            return false;
        return askYesNoQuestion("Are you sure you want to exit the game?");
    }

    public static boolean askYesNoQuestion(String question) {
        for (;;) {
            System.out.printf("%s [y/n] ", question);
            String answer = Main.input.nextLine();
            switch (answer.toLowerCase()) {
                case "y": return true;
                case "n": return false;
            }
            System.out.println("Please answer 'y' or 'n'.");
        }
    }

    public static void helpCommand(String[] args) {
        if (!checkArgCount(args, 1, 2))
            return;
        System.out.println(
            "Commands:\n" +
            "  help    List commands\n" +
            "  quit    Exit the game\n" +
            "  show    Display information\n"
        );
    }

    // TODO (kvanbortel): "Type 'help show' for usage."
    private static boolean checkArgCount(String[] args, int min, int max) {
        if (args.length < min) {
            System.out.println("Not enough arguments.");
            return false;
        }

        if (args.length >= max) {
            System.out.println("Too many arguments.");
            return false;
        }

        return true;
    }
}
