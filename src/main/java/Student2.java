import java.util.ArrayList;

public class Student2 {

    int i = 0;
    private int indexNumber;
    private String name;
    private String surname;
    private String birthDate;
    private String schoolClass;
    private ArrayList<Grade> gradeList = new ArrayList();

    public boolean addGrade(int grade, String subject, String gradeDate){
        Grade newGrade = new Grade(grade, subject, gradeDate);
        if (grade >= 1 && grade <= 6) {
            gradeList.add(i, newGrade);
            System.out.println(gradeList.get(i).grade);
            System.out.println(gradeList.get(i).subject);
            System.out.println(gradeList.get(i).gradDate);
            i += 1;
            return true;
        }
        return false;
    }


}

class Grade {

    int grade;
    String subject;
    String gradDate;

    Grade(int grade, String subject, String gradeDate){
        this.grade = grade;
        this.subject = subject;
        this.gradDate = gradeDate;
    }
}
