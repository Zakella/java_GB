package OOP.SimpleProject.src.main.java.ru.gb.oseminar.service;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupService {

    public List<StudyGroup> completeStudyGroup(Teacher teacher, List<Student> studentsList) {

        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(new StudyGroup(teacher, studentsList));
        return studyGroupList;

    };
}
