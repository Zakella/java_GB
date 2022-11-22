package OOP.SimpleProject.src.main.java.ru.gb.oseminar.service;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;

import java.util.List;

public interface DataService {
    void createUser (String firstName, String lastName, String patronymic);

    List<User> getAll ();

    void deleteUser(Long id);

}
