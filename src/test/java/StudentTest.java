import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student student = new Student();

    @Test
    public void shouldReturnTrueWhenGradeIsBetween1And6() {
        assertEquals(true, student.addGrade(6));
        assertEquals(true, student.addGrade(1));
    }

    @Test
    public void shouldReturnFalseWhenGradeIsLessThan1() {
        assertEquals(false, student.addGrade(0));
    }

    @Test
    public void shouldReturnFalseWhenGradeIsOver6() {
        assertEquals(false, student.addGrade(7));
    }

    @Test
    public void shouldReturnFalseWhenArrayIsFull() {
        assertEquals(true, student.addGrade(6));
        assertEquals(true, student.addGrade(1));
        assertEquals(true, student.addGrade(3));
        assertEquals(true, student.addGrade(5));
        assertEquals(true, student.addGrade(6));
        assertEquals(true, student.addGrade(2));
        assertEquals(true, student.addGrade(1));
        assertEquals(false, student.addGrade(3));
    }

}
