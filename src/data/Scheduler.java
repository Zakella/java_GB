package data;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private  static final List<Task> tasksList = new ArrayList<>();


    public List<Task> getTasks(){
        return tasksList;
    }


}

