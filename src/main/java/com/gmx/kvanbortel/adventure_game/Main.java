package com.gmx.kvanbortel.adventure_game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SaveData saveData = new SaveData();

        System.out.print("Enter your username: ");
        saveData.setUsername(input.nextLine());
        System.out.println(saveData.getUsername());

        loop: while (true) {
            System.out.println("Enter a command (help)");
            String command = input.nextLine();

            switch (command) {
                case "help":
                    System.out.println("Commands: get username, quit, help");
                    break;
                case "get username":
                    System.out.println(saveData.getUsername());
                    break;
                case "quit":
                    break loop;
                default:
                    System.out.println("Invalid command. 'help' for help");
            }
        }
    }
}
