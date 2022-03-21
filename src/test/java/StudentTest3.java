import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest3 {

    Student3EnumAndMap student3 = new Student3EnumAndMap();

    @Test
    public void shouldReturnTrueWhenGradeBetween1And6() {
        Grade grade = new Grade(4, SchoolSubjectEnum.MATEMATYKA, LocalDate.of(2010,5,10));
        assertEquals(true, student3.addGradeToMap(grade));
        Grade grade1 = new Grade(6, SchoolSubjectEnum.MATEMATYKA, LocalDate.of(2010,5,10));
        assertEquals(true, student3.addGradeToMap(grade1));
        assertEquals(true, student3.returnGradeList(SchoolSubjectEnum.MATEMATYKA));
    }

}
