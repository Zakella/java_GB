package OOP.SimpleProject.src.main.java.ru.gb.oseminar;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.controller.Controller;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Teacher;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Petr", "Ivanov", "Anton");
        controller.createUser("Ilon", "Mask", "Joe");
        controller.createUser("Joe", "Doe", "Djek");
        controller.createUser("Andrei", "Doe", "Djek");
        //        controller.showAllStudents();
//        List <StudyGroup> studyGroups  = controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L),
//                controller.getOnlyStudents());
//        controller.showStudyGroups(studyGroups);
        controller.showSortStudyGroup(controller.getOnlyStudents());


    }
}
