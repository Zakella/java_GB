package OOP.SimpleProject.src.main.java.ru.gb.oseminar;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.controller.Controller;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Teacher;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        List<Student> studentsGr1 = new ArrayList<>();
        studentsGr1.add(new Student("Petr", "Zaverin", "Anton"));
        studentsGr1.add(new Student("Ilon", "Mask", "Joe"));
        studentsGr1.add(new Student("Joe", "Doe", "Djek"));

        Teacher teacher = controller.createTeacher("Master", "Ioda", "Djedai", 111L);
        controller.createTimetable(teacher, studentsGr1);

        List<Student> studentsGr2 = new ArrayList<>();
        studentsGr2.add(new Student("Petr", "Zaverin", "Anton"));
        studentsGr2.add(new Student("Ilon", "Mask", "Joe"));
        studentsGr2.add(new Student("Joe", "Doe", "Djek"));

       controller.createTimetable(controller.createTeacher("Bill", "Gaits", "Noname", 222L)
                , studentsGr2);

        controller.showStudentsInGroups();


    }
}
