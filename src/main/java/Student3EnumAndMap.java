import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student3EnumAndMap {

        private int indexNumber;
        private String name;
        private String surname;
        private String birthDate;
        private String schoolClass;
        private Map<SchoolSubjectEnum, List<Grade>> gradeMap = new HashMap<>();

        public boolean addGradeToMap(final Grade gradeToAdd) {
                if (gradeToAdd.getGrade() >= 1 && gradeToAdd.getGrade() <= 6) {
                        List<Grade> value;
                        if (!gradeMap.containsKey(gradeToAdd.getSubject())){
                                value = new ArrayList<>();
                                value.add(gradeToAdd);
                                gradeMap.put(gradeToAdd.getSubject(), value);
                        } else {
                                SchoolSubjectEnum key = gradeToAdd.getSubject();
                                value = gradeMap.get(key);
                                value.add(gradeToAdd);
                        }
                        return true;
                }
                return false;
        }

        public List<Grade> returnGradeList(SchoolSubjectEnum subjectEnum) {
                if (gradeMap.containsKey(subjectEnum)){
                        return gradeMap.get(subjectEnum);
                }
                return null;
        }




        public int getIndexNumber() {
                return indexNumber;
        }

        public void setIndexNumber(int indexNumber) {
                this.indexNumber = indexNumber;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public String getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(String birthDate) {
                this.birthDate = birthDate;
        }

        public String getSchoolClass() {
                return schoolClass;
        }

        public void setSchoolClass(String schoolClass) {
                this.schoolClass = schoolClass;
        }
}
