import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student student = new Student();
    Student2 student2 = new Student2();

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

    @Test
    public void shouldReturn3WhenGradesSumEqualTo21() {
        assertEquals(true, student.addGrade(6));
        assertEquals(true, student.addGrade(1));
        assertEquals(true, student.addGrade(2));
        assertEquals(true, student.addGrade(5));
        assertEquals(true, student.addGrade(4));
        assertEquals(true, student.addGrade(2));
        assertEquals(true, student.addGrade(1));
        assertEquals(3, student.calculateAvgGrade(), 0);
    }

    @Test
    public void shouldReturn3WhenGradesSumEqualTo6() {
        assertEquals(true, student.addGrade(5));
        assertEquals(true, student.addGrade(1));
        assertEquals(3, student.calculateAvgGrade(), 0);
    }

    @Test
    public void should() {
        assertEquals(true, student2.addGrade(5, "Matematyka", "25.05.2018"));
        assertEquals(true, student2.addGrade(4, "Matematyka", "19.03.2020"));
    }

}
