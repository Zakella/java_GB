package OOP.SimpleProject.src.main.java.ru.gb.oseminar.service;

import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Student;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.StudyGroup;
import OOP.SimpleProject.src.main.java.ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupService {

    private  final List<StudyGroup> studyGroupList;
    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public void completeStudyGroup(Teacher teacher, List<Student> studentsList, Integer groupId) {
        this.studyGroupList.add(new StudyGroup(teacher, studentsList, groupId));
    };


    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }
}
