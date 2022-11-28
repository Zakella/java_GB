package OOP.SimpleProject.src.main.java.ru.gb.oseminar.view;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroupComparator;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.User;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.service.StudyGroupService;

import java.util.Collections;
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

    public void showStudents(List<Student> students ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student group : students) {
            log.info(group.toString());
        }
    }

    public void showStudentsInGroup( List<StudyGroup> studyGroupList){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup groups : studyGroupList) {
//            log.info("Id: " + groups.toString());
            System.out.println("Group №: " + groups.getIdStudentGroup());
            List <Student> studentsList = groups.getStudentsList();
            Collections.sort(studentsList, new StudyGroupComparator());
            for (Student student:studentsList){
                System.out.println(student);
//                log.info(student.toString());
            };
        }

    }

}
