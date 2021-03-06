import java.beans.PropertyEditorSupport;

public class Student {


    private int indexNumber;
    private String name;
    private String surname;
    private String birthDate;
    private String schoolClass;
    private int[] schoolGrades = new int[7];

    public boolean addGrade(int grade) {

        if (grade >= 1 && grade <= 6) {
            for (int i = 0; i < schoolGrades.length ; i++){
                if (schoolGrades[i] == 0){
                    schoolGrades[i] = grade;
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public double calculateAvgGrade() {
        double sum = 0;
        int numberOfGrades = 0;
        for (int i = 0; i < schoolGrades.length; i++){
            sum = sum + schoolGrades[i];
            if(schoolGrades[i] != 0) {
                numberOfGrades += + 1;
            }
        }
        sum /= numberOfGrades;
        return sum;
    }

    int getIndexNumber() {
        return this.indexNumber;
    }

    void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return this.surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getBirthDate() {
        return this.birthDate;
    }

    void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    String getSchoolClass() {
        return this.schoolClass;
    }

    void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    int[] getSchoolGrades() {
        return schoolGrades;
    }

    void setSchoolGrades(int[] schoolGrades) {
        this.schoolGrades = schoolGrades;
    }
}
