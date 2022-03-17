import java.time.LocalDate;

public class Grade {
    private int grade;
    private String subject;
    private LocalDate gradDate;

    public Grade(int grade, String subject, LocalDate gradeDate) {
        this.grade = grade;
        this.subject = subject;
        this.gradDate = gradeDate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getGradDate() {
        return gradDate;
    }

    public void setGradDate(LocalDate gradDate) {
        this.gradDate = gradDate;
    }
}
