package OOP.SimpleProject.src.main.java.ru.gb.oseminar;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name", "LastName", "Patronymic");

    }
}