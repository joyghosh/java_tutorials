package java8.clone.deep;

public class Student implements Cloneable{

    public Integer id;
    public String name;
    public Course course;

    public Student(Integer id,
                   String name,
                   Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Object clone()
            throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
}
