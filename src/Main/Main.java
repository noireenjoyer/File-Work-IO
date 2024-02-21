package Main;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriteService fileWriteService = new FileWriteService();
        FileReadService fileReadService = new FileReadService();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create and write file");
            System.out.println("2. Read file");
            System.out.println("3. Exit");

            System.out.print("Enter the option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter files name (without extension): ");
                    String fileName = scanner.nextLine();
                    System.out.print("Enter information into the file: ");
                    String content = scanner.nextLine();

                    fileWriteService.writeToFile(fileName, content);
                    break;
                case 2:
                    System.out.print("Enter files name (without extension): ");
                    String readFileName = scanner.nextLine();
                    String fileContent = fileReadService.readFromFile(readFileName);

                    System.out.println("File contents:");
                    System.out.println(fileContent);
                    break;
                case 3:
                    System.out.println("The program ends");
                    System.exit(0);
                default:
                    System.out.println("Incorrect choice. Please try again.");
            }
        }
    }
}
