package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please input string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public Boolean yesNo(){
        String userInput = getString("Please enter yes or no: ");
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        }
        else {
            return false;
        }
    }

    public int getInt(int min, int max, String enterYourChoice) {
        while (true) {
            System.out.println("Please enter a number between " + min + " and " + max);
            String userInput = getString();
            try {
                int num = Integer.valueOf(userInput);
                if (num < min || num > max) {
                    System.out.println("Input out of range. Please try again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }


    public double getDouble(double min, double max) {
        while (true) {
            System.out.println("Please enter a number between " + min + " and " + max);
            String userInput = getString();
            try {
                double num = Double.valueOf(userInput);
                if (num < min || num > max) {
                    System.out.println("Input out of range. Please try again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public int getInt(String s, int x, int y) {
        while (true) {
            System.out.println("Please enter a number between " + s + " and " + y);
            String userInput = getString();
            try {
                int num = Integer.valueOf(userInput);
                if (num < x || num > y) {
                    System.out.println("Input out of range. Please try again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public double getDouble(String s, double x, double y) {
        while (true) {
            System.out.println("Please enter a number between " + s + " and " + y);
            String userInput = getString();
            try {
                double num = Double.valueOf(userInput);
                if (num < x || num > y) {
                    System.out.println("Input out of range. Please try again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }


    public static int getBinary(String binaryString) {
        return Integer.valueOf(binaryString, 2);
    }

    public static int getHex(String hexString) {
        return Integer.valueOf(hexString, 16);
    }

    public static void main(String[] args) {
        String binary = "111"; // Binary representation of 7
        String hex = "10"; // Hexadecimal representation of 16

        int binaryNumber = getBinary(binary);
        int hexNumber = getHex(hex);

        System.out.println("Binary number: " + binaryNumber);
        System.out.println("Hex number: " + hexNumber);
    }
}