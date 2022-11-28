package OOP.SimpleProject.src.main.java.ru.gb.oseminar.data;
import java.util.List;


public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentsList;

    public Integer getIdStudentGroup() {
        return idStudentGroup;
    }

    private Integer idStudentGroup;

    public StudyGroup(Teacher teacher, List<Student> studentsList, Integer idStudentGroup) {
        this.teacher = teacher;
        this.studentsList = studentsList;
        this.idStudentGroup = idStudentGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                ", idStudentGroup=" + idStudentGroup +
                '}';
    }
}
