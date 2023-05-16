import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

// 1. Loop Basics
        // a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        // b. Do While
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);


//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while(i >= -10);
//
//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while(i <= 1000000);
//    }

        // c. For - Refactor
//        for(int i = 0; i <=100; i += 2) {
//            System.out.println(i + " ");
//        }


//        for(int i = 5; i <=15; i++) {
//            System.out.println(i + " ");
//        }
//
//        for(int i = 100; i >= -10; i -=5) {
//            System.out.println(i);
//        }
//
//
//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

// 2. Fizzbuzz

//            for(int i = 1; i <= 100; i++) {
//                if(i % 3 == 0 && i % 5== 0) {
//                    System.out.println("FizzBuzz");
//                } else if(i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if(i % 5 == 0) {
//                    System.out.println("Buzz");
//                }
//                else {
//                    System.out.println(i);
//                }

// 3. Table of Powers
//        Scanner scanner = new Scanner(System.in);
//                System.out.print("What number would you like to go up to? ");
//            int userNumber = scanner.nextInt();
//                System.out.println("\nHere is your table!\n");
//                System.out.printf("%-8s | %-8s | %-8s %n", "number", "squared", "cubed");
//                System.out.printf("%-8s | %-8s | %-8s %n", "--------", "--------", "--------");
//            for(int i = 1; i <= userNumber; i++) {
//                System.out.printf("%-8d | %-8d | %-8d %n", i, i * i, i * i * i);
//        }

// 4. Convert given number grades into letter grades
        Scanner scanner = new Scanner(System.in);
        String userAnswer;

        do {
            int userInput = 0;
            String letterGrade;
            do {
                System.out.println("\nEnter a grade between 1-100:");
                userInput = scanner.nextInt();

            } while ((userInput < 1) || (userInput > 100));

            if (userInput >= 88) {
                letterGrade = "A";
            } else if (userInput >= 80) {
                letterGrade = "B";
            } else if (userInput >= 67) {
                letterGrade = "C";
            } else if (userInput >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.printf("Your grade of %d = %s", userInput, letterGrade);
            System.out.println("\n Do you wish to input another grade? \n Type yes and enter to continue. \n Type anything else and hit enter to cancel.");
            userAnswer = scanner.next();

            } while (userAnswer.equals("yes"));


    }
}