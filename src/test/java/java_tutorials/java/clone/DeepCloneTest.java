package java_tutorials.java.clone;

import java8.clone.deep.Student;
import java8.clone.deep.Course;
import org.junit.Assert;
import org.junit.Test;

public class DeepCloneTest {

    @Test
    public void testDeepCopy(){
        Course c = new Course("Physics", "Maths", "Biology");
        Student s1 = new Student(2001, "James Maxwell", c);

        try {
            Student s2 = (Student) s1.clone();

            Assert.assertEquals(s1.id, s2.id);
            Assert.assertEquals(s1.name, s2.name);
            Assert.assertNotEquals(s1.course, s2.course);

            s2.course.subject1 = "English";
            Assert.assertNotEquals(s1.course.subject1, s2.course.subject1);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
