package model;

public class Grade
{
    private Student student;
    private Course course;
    private int mark;

    public Grade(Student student, Course course, int mark)
    {
        this.student = student;
        this.course = course;
        this.mark = mark;
    }

    public Student getStudent()
    {
        return student;
    }

    public Course getCourse()
    {
        return course;
    }

    public int getMark()
    {
        return mark;
    }
}
