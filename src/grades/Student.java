package grades;
import java.util.ArrayList;

public class Student {

    private final String name;

    private final ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // methods for grades property
    public ArrayList<Integer> getGrades() {
        return grades;
    }


    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return sum / grades.toArray().length;
    }


//    ---- BONUS WORK ----
public void getClassGrades(){
    for(int i = 0; i <this.grades.size(); i ++){
        System.out.println(this.grades.get(i) + " ");
    }
}

    // returns the average of the students grades
    public double getClassAverage(){
        double total = 0;
        for(int i = 0; i<grades.size(); i++){
            total += grades.get(i);
        }
        return total/grades.size();
    }

}
