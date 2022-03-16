public class Student {

    private int indexNumber;
    private String name;
    private String surname;
    private String birthDate;
    private String schoolClass;
    private int[] schoolGrades = new int[7];

    public boolean addGrade(int grade) {
        if (grade >= 1 && grade <= 6) {
                return true;
            }
        return false;
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
