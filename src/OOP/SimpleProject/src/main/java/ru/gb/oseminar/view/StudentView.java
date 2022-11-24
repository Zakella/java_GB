package OOP.SimpleProject.src.main.java.ru.gb.oseminar.view;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.StudyGroupService;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroups) {
            log.info(group.toString());
        }
    }

    public void showStudents(List<Student> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student group : studyGroups) {
            log.info(group.toString());
        }
    }
}
