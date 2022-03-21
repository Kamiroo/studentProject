import java.time.LocalDate;

public class Grade {
    private int grade;
    private SchoolSubjectEnum subject;
    private LocalDate gradDate;

    public Grade(int grade, SchoolSubjectEnum subject, LocalDate gradeDate) {
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

    public SchoolSubjectEnum getSubject() {
        return subject;
    }

    public void setSubject(SchoolSubjectEnum subject) {
        this.subject = subject;
    }

    public LocalDate getGradDate() {
        return gradDate;
    }

    public void setGradDate(LocalDate gradDate) {
        this.gradDate = gradDate;
    }
}
