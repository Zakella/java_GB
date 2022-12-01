package controller;

import data.Priority;
import data.Scheduler;
import service.SchedulerService;
import service.TaskService;
import view.TaskViewer;

import java.util.HashMap;

public class Controller {
    private final SchedulerService scheduleService = new SchedulerService();
    private final TaskService taskService;
    private final TaskViewer viewer;

    public Controller() {
        this.taskService = new TaskService();
        this.viewer = new TaskViewer();
    }

    public void startScheduler() {
        this.scheduleService.startScheduler();

    }

    public void addTask(Priority priority, String handler, String description, String author) {
        scheduleService.addTaskInScheduler(taskService.createTask(priority, handler, description, author));
    }

    public void showTasks()
    {this.viewer.showTasks(scheduleService.getTasks());
    }

    public void editTask(Integer taskId, HashMap<String ,?> map ){
       this.taskService.editTask(scheduleService.getTaskById(taskId),map);
    }

    public void showTaskById(Integer taskId){
        this.viewer.showTask(scheduleService.getTaskById(taskId));

    }

    public void deleteTask(Integer taskId){
        scheduleService.deleteTaskById(taskId);
    }

    public void writeAllTasksInFile(String format){
            scheduleService.writeTasksInFile(scheduleService.getTasks(), format);
    }
}
