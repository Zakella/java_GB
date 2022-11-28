package OOP.SimpleProject.src.main.java.ru.gb.oseminar;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.controller.Controller;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Teacher;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.StudyGroupService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createTimetable(controller.createTeacher("Master", "Ioda", "Djedai", 111L),
                new ArrayList<>(
                        Arrays.asList(
                                new Student("Petr", "Zaverin", "Anton"),
                                new Student("Ilon", "Mask", "Joe"),
                                new Student("Joe", "Doe", "Djek")

                        )
                ));

        controller.createTimetable(controller.createTeacher("Bill", "Gaits", "Noname", 222L)
                , new ArrayList<>(
                        Arrays.asList(
                                new Student("Alexey", "Petrov", "Anton"),
                                new Student("Alexey", "Alexeev", "Joe"),
                                new Student("Jony", "Dilindjer", "Djek")

                        )
                ));

        controller.showStudentsInGroups();


    }
}
