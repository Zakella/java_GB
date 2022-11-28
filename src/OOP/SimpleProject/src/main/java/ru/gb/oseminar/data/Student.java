package OOP.SimpleProject.src.main.java.ru.gb.oseminar.data;

public class Student extends User {
    private Long studentID;

    public Student(String firstName, String lastName, String patronymic, Long studentID) {
        super(firstName, lastName, patronymic);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }


}
