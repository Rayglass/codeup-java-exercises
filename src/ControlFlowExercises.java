import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

// 1. Loop Basics
        // a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.print("i is " + i);
        //    System.out.print(i + " "); -- either one works`
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
//            i *= i;
//        } while(i <= 1_000_000);
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
//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }
// --------------------------------------------------------------------------
// 2. Fizzbuzz

//            for(int i = 1; i <= 100; i++) {
//                if(i % 3 == 0 && i % 5== 0) {
//                    System.out.println("FizzBuzz");
//                } else if(i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if(i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }

// --------------------------------------------------------------------------

// 3. Table of Powers
//        Scanner Scanner = new Scanner(System.in);
//
//        boolean confirm = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInp = Scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userInp; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cubed);
//            }
//            System.out.println("Would you like to continue? [y/n]");
//            confirm = Scanner.next().equalsIgnoreCase("y");
//        } while (confirm);
//        System.out.println("Cool...");

// --------------------------------------------------------------------------

// 4. Convert given number grades into letter grades
        Scanner Scanner = new Scanner(System.in);

        boolean confirm = true;

        do {

            System.out.println("Enter your grade from 0 to 100.");

            int userGrade = Scanner.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Continue? [y/n]");
            confirm = Scanner.next().equalsIgnoreCase("y");

        } while(confirm);
        System.out.println("Thank You");


    }
}

