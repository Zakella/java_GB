package OOP.SimpleProject.src.main.java.ru.gb.oseminar.data;

public class Teacher extends User {
    private Long teacherID;

    public Teacher(String firstName, String lastName, String patronymic, Long teacherID) {
        super(firstName, lastName, patronymic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }
}
