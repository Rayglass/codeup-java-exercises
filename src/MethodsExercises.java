import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        addition(4, 3);
//        subtraction(9, 2);
//        multiplication(3, 3);
//        division(12, 5);
//        modulus(9, 4);
//        count(5);
//        getInteger(1, 3);
//        factorial();
        diceRoll();
//        sayHi(3);

    }

    // 1. Basic Arithmetic

    public static void addition(int x, int y) {
        System.out.println(x + y);
    }

    public static void subtraction(int x, int y) {
        System.out.println(x - y);
    }

    public static void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    public static void division(double x, double y) {
        System.out.println(x / y);
    }

    public static void modulus(int x, int y) {
        System.out.println(x % y);
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    // 2. Method Evaluation
    public static int getInteger(int min, int max) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = Scanner.nextInt();

        if (input > max || input < min) {
            System.out.println("Your number is invalid!");
            return getInteger(min, max);
        }
        System.out.printf("your number is %s", input);
            return input;
    }

    // 3. Factorial of a Number

    public static void factorial() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10:");
        int input = Scanner.nextInt();
        System.out.println("you picked number " + input);
        System.out.println("Do you want to continue [y/n]");
        String answer = Scanner.next();

        if (answer.equals("y")) {

            int sum = 1;
            for (int i = 1; i <= input; i++) {
                sum *= i;
                System.out.println(sum);
            }
        }
    }

//        public static void factorial(){
//            Scanner Scanner = new Scanner(System.in);
//            System.out.println("Please enter a number between 1 and 10: ");
//            String userIntStr = Scanner.nextLine();
//            int userInt = Integer.parseInt(userIntStr);
//            if (!(userInt >= 1 && userInt <= 10)){
//                factorial();
//            }
//
//            String choice;
//            do {
//                for (long i = 1; i <= userInt; i++) {
//                    long factorial = i;
//                    System.out.printf("%s! = 1 ", factorial);
//                    for (long l = 1; l <= i; l++) {
//                        factorial *= l;
//                        if (l != 1) {
//                            System.out.printf("x %s ", l);
//                        }
//                    }
//                    System.out.printf("  = %s%n", factorial);
//                }
//                System.out.println("Would you like to continue? [y/N]");
//                choice = Scanner.nextLine();
//
//            } while (choice.equalsIgnoreCase("y"));
//        }


    // 4. DICE ROLL
    public static void diceRoll (){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Give me a number of sides for a pair of dice: ");
        String diceSidesStr = Scanner.nextLine();
        int diceSides = Integer.parseInt(diceSidesStr);
        System.out.printf("Your first di rolled a %s.%nYour second di rolled a %s", randomNum(diceSides), randomNum(diceSides));
    }
    public static int randomNum (int num){
        return (int)((Math.random() * (num)) + 1);
    }


// Recursive Practice

    public static void sayHi(int count) {
        System.out.println("Hi!");

        if (count <= 1) {
            return;
        }
        sayHi(count -1);
    }



}
