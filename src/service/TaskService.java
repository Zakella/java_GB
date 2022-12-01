package service;
import data.Priority;
import data.Task;
import java.util.HashMap;

public class TaskService {

    public Task createTask(Priority priority, String handler, String description, String author) {
        return new Task(priority, handler, description, author);
    }

    public void editTask(Task task, HashMap<String ,?> map  ){

        if (map.isEmpty()){
            throw new IllegalStateException("Edit fields is empty!");
        }


       if (map.containsKey("priority")) {
            task.setPriority((Priority) map.get("priority"));

        }

        if (map.containsKey("handler")) {
            task.setHandler((String) map.get("handler"));

        }

        if (map.containsKey("description")) {
            task.setDescription((String) map.get("description"));

        }

        if (map.containsKey("done")) {
            task.setDone((Boolean) map.get("done"));

        }

        else {
            throw new IllegalStateException("Field is not found!");
        }


    }

}
