package java_tutorials.java.clone;

import java8.clone.shallow.Course;
import java8.clone.shallow.Student;
import org.junit.Assert;
import org.junit.Test;


public class ShallowCloneTest {

    @Test
    public void testShallowCopy() {
        Course science = new Course("Engg. Mathematics",
                "Science",
                "Biology");
        Student s1 = new Student(1001, "John Doe", science);
        try {
            Student s2 = (Student) s1.clone();
            Assert.assertEquals(s1.id, s2.id);
            Assert.assertEquals(s1.name, s2.name);
            Assert.assertEquals(s1.course, s2.course);

            s2.course.subject1 = "Maths";
            Assert.assertEquals(s1.course.subject1, s2.course.subject1);

            s2.id = 1002;
            Assert.assertEquals(s2.id, s1.id);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
