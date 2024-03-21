//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

class SchoolManagementSystem {
    private final List<String> grades;

    public  SchoolManagementSystem() {
        this.grades = new ArrayList<>();
    }

    public void assignGrade(String studentName, int grade){
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Invalid grade: " + grade + ". Grade must be between 0 and 100.");
            }
            grades.add(studentName + ": " + grade);
            System.out.println("Grade assigned successfully for " + studentName);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid Grade Exception: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted for " + studentName);
        }
    }
    public void printGrades(){
        System.out.println("Grades: ");
        for (String grade : grades){
            System.out.println(grade);
        }
    }
}

public class Main {
    public static void main(String[] args) {
       SchoolManagementSystem schoolSystem = new SchoolManagementSystem();


       schoolSystem.assignGrade("Jordan",85);
       schoolSystem.assignGrade("Charlotte",110);

       schoolSystem.printGrades();
    }
}