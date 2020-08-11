package model;

import java.util.HashMap;

public class Student
{
    private String name;
    private HashMap<Course, Integer> attendances;

    public Student(String name)
    {
        this.name = name;
        this.attendances = new HashMap<>();
    }

    public void enrollCourse(Course course)
    {
        if (!attendances.containsKey(course))
        {
            course.addStudent(this);
            attendances.put(course, 0);
        }
    }

    public void attendCourse(Course course)
    {
        if (attendances.containsKey(course))
        {
            Integer courseAttendance = attendances.get(course);
            courseAttendance++;
            attendances.put(course, courseAttendance);
        }
    }

    public int checkGrade(Grade grade)
    {
        return grade.getMark();
    }
}
