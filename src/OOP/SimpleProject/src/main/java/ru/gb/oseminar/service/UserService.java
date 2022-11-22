package OOP.SimpleProject.src.main.java.ru.gb.oseminar.service;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User user : this.users) {
            if (user instanceof Student) {
                if (id < ((Student) user).getStudentID()) {
                    id = ((Student) user).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronymic, ++id));
    }


    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User user : this.users) {
            if (user instanceof Student) {
                if (id.equals(((Student) user).getStudentID())) {
                    this.users.remove(user);
                }
            }
        }
    }

}
