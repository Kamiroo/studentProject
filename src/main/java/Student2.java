import java.time.LocalDate;
import java.util.ArrayList;

public class Student2 {

    private int indexNumber;
    private String name;
    private String surname;
    private String birthDate;
    private String schoolClass;
    private ArrayList<Grade> gradeList = new ArrayList();

    public boolean addGrade(Grade grade){
        if (grade.getGrade() >= 1 && grade.getGrade() <= 6) {
            gradeList.add(grade);
            return true;
        }
        return false;
    }

    public double calculateAvgGradeList(){
        double value = 0;
        for (Grade grade : gradeList){
            value += grade.getGrade();
        }
        value /= gradeList.size();
        System.out.println(value);
        return value;
    }
}