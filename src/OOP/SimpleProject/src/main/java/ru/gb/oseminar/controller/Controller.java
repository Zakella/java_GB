package OOP.SimpleProject.src.main.java.ru.gb.oseminar.controller;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Teacher;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.UserService;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.StudyGroupService;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);

    }

    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId) {
        return userService.createUser(firstName, lastName, patronymic, teacherId);

    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public List<Student> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public List<StudyGroup> createTimetable(Teacher teacher, List<Student> studentList) {
        return studyGroupService.completeStudyGroup(teacher, studentList);
    }

    public void showStudyGroups(List<StudyGroup> studyGroups){
        studentView.showStudyGroups(studyGroups);
    }


}
