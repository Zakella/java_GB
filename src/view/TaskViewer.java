package view;

import data.Task;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class TaskViewer {
    public void showTasks(List <Task> tasksList) {
        tasksList.forEach(task -> Logger.getAnonymousLogger().info(task.toString()));
    }

    public void showTask(Task task){
        Logger.getAnonymousLogger().info(task.toString());

    }
}
