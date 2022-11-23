package OOP.SimpleProject.src.main.java.ru.gb.oseminar.data;
import java.util.List;


public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentsList;

    public StudyGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentsList=" + studentsList +
                '}';
    }
}
