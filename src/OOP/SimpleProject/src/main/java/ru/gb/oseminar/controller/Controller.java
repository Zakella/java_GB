package OOP.SimpleProject.src.main.java.ru.gb.oseminar.controller;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.UserService;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.view.StudentView;

import java.util.List;

public class Controller {

    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    public void createUser (String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

}
