import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// TODO Copy this code into your main method:
    //        double pi = 3.14159;

// TODO Write some Java code that uses the variable pi to output the following:
    //        System.out.printf("The value of pi is approximately %s.%n", pi);
    //        System.out.printf("The value of pi is approximately %.2f.%n", pi);

//      ***********Explore the Scanner Class.***********

        Scanner scanner = new Scanner(System.in);

//        ***Scanner Practice***
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        TODO Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//         What happens if you input something that is not an integer?

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//      If user inputs anything other than an integer, Java provides an error.

//      TODO Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//       What happens if you enter less than 3 words? Would not prompt the print
//       What happens if you enter more than 3 words? Would not allow me to enter more than three until i added 4th variable.

//        System.out.println("Please enter three different words:");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("Your words are: %n %s, %n %s, %n %s, %n", firstWord, secondWord, thirdWord);



//      TODO Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//       do you capture all the words?

//        System.out.println("Please enter in a sentence:");
//        String sent = scanner.next();
//        System.out.printf("Your sentence is: %s", sent);

        // Full Sentence did not print using .next


//      TODO Rewrite the above example using the nextLine method.

//        System.out.println("Please enter in a sentence:");
//        String sent = scanner.nextLine();
//        System.out.printf("Your sentence is: %s", sent);

        // Sentence Printed as Expected.



//      ***********Calculate the perimeter and area of Codeup's classrooms.***********

//      TODO Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//       Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//       Assume that the rooms are perfect rectangles.
//       Assume that the user will enter valid numeric data for length and width.

//      TODO Display the area and perimeter of that classroom.
//       The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//        System.out.println("What is the length of your room?");
//        double length = scanner.nextDouble();
//        System.out.println("What is the width of your room?");
//        double width = scanner.nextDouble();
//        System.out.println("What is the height of your room?");
//        double height = scanner.nextDouble();
//
//        //Calculating the area of the room
//        double area = length*width;
//        System.out.printf("The area if the room is %.2f square feet %n", area);
//
//        double perimeter = (length*2) + (width*2);
//        System.out.printf("The perimeter of the room is %.2f feet %n", perimeter);
//
//        double volume = length * width * height;
//        System.out.printf("The volume of the room is %.2f feet %n", volume);


//      ***********Bonuses***********

//        TODO In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.


//         TODO The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):

//        scanner.useDelimiter("\n");

//          TODO How does this change the way your program operates?
//           Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
        //Once I added nextInt it would no longer accept decimals.
    }
}