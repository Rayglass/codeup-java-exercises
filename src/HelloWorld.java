public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

//  Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int MyFavoriteNumber = 51;
//        System.out.println(MyFavoriteNumber);

//  Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "3.14159";
//        System.out.println(myString);
//      String myString = "Test" --> worked logged test

//  Change your code to assign a character value to myString. What do you notice?
    //  String myString = 'a' --> did not work. error (char value not string)

//  Change your code to assign the value 3.14159 to myString. What happens?
    //  String myString = "3.14159" -- worked inside of string "" only

//  Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
    //  Does not recognize the variable.

//  Change your code to assign the value 3.14 to myNumber. What do you notice?
    //  long myNumber = 3.14; Results in error - does not fall within the category of long

//  long myNumber = 123L; Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
    // Result logged 123

//  Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
    // float myNumber = 3.14; Resulted in Error - to resolved added 3.14f;

//  Copy and paste the following code blocks one at a time and execute them
//      int x = 5;
//      System.out.println(x++);
//      System.out.println(x);
        // Resulted in 5 and 6 respectively

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//  Resulted in 6 and 6 respectively - on the second one the add was performed before the input was accepted

//  Try to create a variable named class. What happens?
//        String class = "test";
        // results in error - not a statement - class is a keyword

// Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //cannot be cast to class java.lang.Integer

// Copy and paste the code above and then run it. Does the result match with your expectation?
//How is the above example different from the code block below?
//        int three = (int) "three";

        //incompatible types: java.lang.String cannot be converted to int
//What are the two different types of errors we are observing?

// Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
////        x = x + 5;
//            x += 5;
//        System.out.println(x);
////
//
//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//        System.out.println(y);
//
//
        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
          x /= y;
          y -= x;
        System.out.println(x);
//        System.out.println(x);
//        System.out.println(y);

// What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//Hint: Integer.MAX_VALUE is a class .,lconstant (we'll learn more about these later) that holds the maximum value for the int type.

        // max value for byte is   byte (-128 to 127)
        // error says required type is 'byte' but i have entered a 'int' value bc its bigger than the byte's range of (-128 to 127)
        // byte num = 150;

//  sout tab = shortcut to print out
        
    }
}
