import controller.Controller;
import data.Priority;

import java.util.*;

public class Aplication {

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.startScheduler();
        controller.addTask(Priority.HIGH,"First task", "You need to test your first task", "VZ");
        controller.addTask(Priority.MEDIUM,"Testing  tasks", "Ok, let test it", "VZ");
        controller.addTask(Priority.LOW,"Get all task ", "We need to get all tasks, go on", "VZ");
        controller.addTask(Priority.HIGH,"Edit tasks", "Let test how we can edit ours tasks", "Tester");
        controller.addTask(Priority.HIGH,"Delete tasks", "Now we need delete task", "Tester");
        controller.showTasks();

        HashMap <String,Object> map = new HashMap<>();
        map.put("priority", Priority.HIGH);
        map.put("handler", "test");
        map.put("description", "hello world!");
        map.put("done", true);

        controller.editTask(2, map);
        controller.showTaskById(2);

        controller.deleteTask(5);
        controller.showTasks();




    }
};



