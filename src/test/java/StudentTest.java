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

}
