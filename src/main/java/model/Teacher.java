package model;

public class Teacher
{
    private String name;

    public void teachCourse(Course course)
    {
        course.setTeacher(this);
    }

    public Grade gradeStudent(Student student, Course course, int mark)
    {
        return new Grade(student, course, mark);
    }

    public void defineCourseCurricula(Course course, String curricula)
    {
        course.setCurricula(curricula);
    }
}
