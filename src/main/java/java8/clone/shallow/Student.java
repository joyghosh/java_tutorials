package java8.clone.shallow;

/**
 *
 */
public class Student implements Cloneable{

    public Integer id;
    public String name;
    public Course course;

    public Student(Integer id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
