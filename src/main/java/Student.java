public class Student {

    private int indexNumber;
    private String name;
    private String surname;
    private String birthDate;
    private String schoolClass;
    private int[] schoolGrades = new int[7];

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
        this.indexNumber = indexNumber;
    }

    String getSchoolClass() {
        return this.schoolClass;
    }

    void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }
}
