package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course
{
    private String curricula;
    private List<Student> studentList;
    private Teacher teacher;

    public Course(String curricula)
    {
        this.curricula = curricula;
        this.studentList = new ArrayList<>();
    }

    public String getCurricula()
    {
        return curricula;
    }

    public void setCurricula(String curricula)
    {
        this.curricula = curricula;
    }

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return curricula.equals(course.curricula);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(curricula);
    }
}
