import java.util.List;

public class School {
private final List<Teacher> teachers;
private List<Student> students;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }


    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public List<Teacher> getTeachers(){

        return teachers;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getStudent(){

        return students;
    }

}
