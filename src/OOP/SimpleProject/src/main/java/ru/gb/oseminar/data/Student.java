package OOP.SimpleProject.src.main.java.ru.gb.oseminar.data;

import java.util.concurrent.atomic.AtomicLong;

public class Student extends User {
    private Long studentID;
    private  static final AtomicLong id = new AtomicLong(0);

    public Student(String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
        this.studentID = id.incrementAndGet();
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }


}
