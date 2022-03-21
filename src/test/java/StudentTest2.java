import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StudentTest2 {

    Student2 student2 = new Student2();

    @Test
    public void shouldReturnTrueWhenGradeBetween1And6() {
        Grade grade = new Grade(4, SchoolSubjectEnum.valueOf("MATEMATYKA"), LocalDate.of(2010,5,10));
        Grade grade2 = new Grade(6, SchoolSubjectEnum.valueOf("POLSKI"), LocalDate.of(2010,5,10));
        assertEquals(true, student2.addGrade(grade));
        assertEquals(true, student2.addGrade(grade2));
    }

    @Test
    public void shouldReturnFalseWhenGradeLessThan1() {
        Grade grade = new Grade(0, SchoolSubjectEnum.valueOf("FIZYKA"), LocalDate.of(2003,3,20));
        assertFalse(student2.addGrade(grade));
    }

    @Test
    public void shouldReturnFalseWhenGradeOver6() {
        Grade grade = new Grade(7, SchoolSubjectEnum.valueOf("BIOLOGIA"), LocalDate.of(2003,3,20));
        assertFalse(student2.addGrade(grade));
    }

    @Test
    public void shouldReturn3When13DividedBy4() {
        Grade grade = new Grade(1, SchoolSubjectEnum.valueOf("MATEMATYKA"), LocalDate.of(2003,3,20));
        Grade grade1 = new Grade(3, SchoolSubjectEnum.valueOf("ANGIELSKI"), LocalDate.of(2003,3,10));
        Grade grade2 = new Grade(4, SchoolSubjectEnum.valueOf("FIZYKA"), LocalDate.of(2003,3,12));
        Grade grade3 = new Grade(5, SchoolSubjectEnum.valueOf("POLSKi"), LocalDate.of(2003,3,14));
        assertEquals(true, student2.addGrade(grade));
        assertEquals(true, student2.addGrade(grade1));
        assertEquals(true, student2.addGrade(grade2));
        assertEquals(true, student2.addGrade(grade3));
        assertEquals(3, student2.calculateAvgGradeList(), 0.5);
    }
}
