import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, I am Bob...");

        boolean confirm;

        do {

            System.out.println("Interact with me!");

            String userInput = sc.nextLine();

            if(userInput.trim().endsWith("?")){
                System.out.println("Sure");
            } else if (userInput.trim().endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if(userInput.length() == 0){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to continue? [y/n]");
            confirm = sc.nextLine().equalsIgnoreCase("y");


        } while(confirm);
        System.out.println("Thank You!");
    }
}



//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hi, I am Bob...");
//        String answer;
//
//        do {
//            System.out.println("Interact with me!");
//            String userInput = sc.nextLine();
//
//            if(userInput.trim().endsWith("?")){
//                    System.out.println("Sure");
//            } else if (userInput.trim().endsWith("!")){
//                System.out.println("Whoa, chill out!");
//            } else if(userInput.length() == 0){
//                System.out.println("Fine. Be that way!");
//            } else {
//                System.out.println("Whatever.");
//            }
//
//            System.out.println("Would you like to continue [y/n]");
//            answer = sc.next();
//
//            sc.nextLine();
//
//        } while(answer.equalsIgnoreCase("y"));
//        System.out.println("Thank You");
//    }
//}