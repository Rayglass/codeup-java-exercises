package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

//    private static HashMap<String, Student> students;

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Joe");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);

        Student student2 = new Student("Zach");
        student2.addGrade(65);
        student2.addGrade(70);
        student2.addGrade(70);

        Student student3 = new Student("John");
        student3.addGrade(100);
        student3.addGrade(65);
        student3.addGrade(86);

        Student student4 = new Student("Jimmy");
        student4.addGrade(88);
        student4.addGrade(77);
        student4.addGrade(33);

        students.put("KrazyJoe", student1);
        students.put("ZachAttack", student2);;
        students.put("Deeks", student3);;
        students.put("JBob", student4);;

        System.out.println(students);

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Welcome! \n" +
                    "Here are the GitHub usernames of our students: \n");
            for (String username : students.keySet()) {
                System.out.println("|" + username + "| ");
            }


            System.out.print(" What student would you like to see more information on?");
            String usernameInput = input.nextLine();

            if (students.containsKey(usernameInput)) {
                Student student = students.get(usernameInput);
                System.out.println("\n Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average grade: " + student.getGradeAverage());
            } else {
                System.out.println(" Sorry, no users with that username were found.");
            }

            System.out.print(" Would you like to see another student? (y/n) ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye; Have a wonderful day...");


    }
}





