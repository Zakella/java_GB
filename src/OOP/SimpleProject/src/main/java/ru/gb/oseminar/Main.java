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
        controller.createUser("Petr", "Zaverin", "Anton");
        controller.createUser("Ilon", "Mask", "Joe");
        controller.createUser("Joe", "Doe", "Djek");
        Teacher teacher = controller.createTeacher("Master", "Ioda", "Djedai", 111L);
        controller.createTimetable(teacher, controller.getOnlyStudents(), 123);
        controller.clearUsers();
        controller.createUser("Alexey", "Aavereev", "Borisovich");
        controller.createUser("Petr", "Sidorov", "Avraam");
        controller.createUser("Aavram", "Linkoln", "Avraam");

        controller.createTimetable(controller.createTeacher("Bill", "Gaits", "Noname", 222L)
                , controller.getOnlyStudents(), 333);

         controller.showStudentsInGroups();


    }
}
