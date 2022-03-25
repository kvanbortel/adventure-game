package com.gmx.kvanbortel.adventure_game;

import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] mainArgs) {
        SaveData saveData = new SaveData();

        System.out.print("Enter your username: ");
        saveData.setUsername(input.nextLine());

        System.out.println("A monster arrives!");
        Monster lich1 = new Monster(MonsterType.LICH);
        lich1.display();
        lich1.displayHealthBar();

        // TODO (kvanbortel): "rtd", "roll die [d-amount], show profile/stats"
        System.out.println("Enter a command (Type 'help' for a list of commands):");
        loop: while (true) {
            System.out.print("> ");
            String[] args = input.nextLine().split(" +");
            if (args.length > 0) {
                switch (args[0]) {
                    case "help":
                        Command.helpCommand(args);
                        continue;
                    case "show":
                        Command.parseShowCommand(args, saveData);
                        continue;
                    case "quit":
                        if (Command.parseQuitCommand(args))
                            break loop;
                        continue;
                }
            }
            System.out.println("Invalid command. Type 'help' for help.");
        }
    }
}
