package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Joe");
        Student s2 = new Student("Zach");
        Student s3 = new Student("John");
        Student s4 = new Student("Jimmy");

        s1.addGrade(10);
        s1.addGrade(13);
        s1.addGrade(14);
        s2.addGrade(5);
        s2.addGrade(9);
        s2.addGrade(15);
        s3.addGrade(8);
        s3.addGrade(10);
        s3.addGrade(12);
        s4.addGrade(10);
        s4.addGrade(7);
        s4.addGrade(11);

        Student s5 = new Student("Five");
        s5.addGrade(3);
        s5.addGrade(7);
        s5.addGrade(11);



        System.out.println(s4.getGrades());
        System.out.println(s4.getGradeAverage());
        System.out.println(s4.getName());

        System.out.println(s2.getGrades());
        System.out.println(s2.getGradeAverage());
        System.out.println(s2.getName());

        System.out.println(s5.getGrades());
        System.out.println(s5.getGradeAverage());
        System.out.println(s5.getName());


    }

}
