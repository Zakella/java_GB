package service;
import data.Scheduler;
import data.Task;
import java.util.List;
import java.util.Optional;


public class SchedulerService {

    private final Scheduler scheduler = new Scheduler();


    public  void startScheduler(){
        System.out.println("Scheduler started");

    }

    public void addTaskInScheduler(Task task){
        List<Task> tasksList =  scheduler.getTasks();
        tasksList.add(task);

    }

    public List<Task> getTasks(){
        return scheduler.getTasks();
    }


   public Task  getTaskById(Integer idTask){
       List <Task> tasksList = new SchedulerService().getTasks();
       Optional<Task> task = tasksList.stream().
               filter(item -> idTask.equals(item.getId()))
               .findAny();
       if (!task.isPresent()){
           throw new RuntimeException("Task is not found!");
       }
       else{
           return task.get();
       }
   }

   public void deleteTaskById(Integer taskId){
      List<Task> taskList = this.getTasks();
      taskList.remove(this.getTaskById(taskId));

   }

}
