package data;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Task {
    private Priority priority;
    private final Date taskDate ;
    private static Integer id = 0;
    private final Integer taskID;
    private String handler;
    private String description;

    private final String author ;

    private Boolean done = false;

    public Task(Priority priority, String handler, String description, String author) {

        this.priority = priority;
        this.handler = handler;
        Date now = new Date();
        this.taskDate =   Calendar.getInstance().getTime();
        this.description = description;
        this.author = author;
        this.taskID = ++id;

    }


    public Priority getPriority() {
        return priority;
    }

    public String getTaskDate() {
        SimpleDateFormat DateFormat
                = new SimpleDateFormat("yyyy/MM/dd hh:mm");
        return DateFormat.format(this.taskDate);
    }

    public Integer getId() {
        return taskID;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }


    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return String.format("Task №%d, from %s \n" +
                "priority: %s,\n" +
                "Theme: %s \n" +
                "Description: %s \n" +
                "Task is done: %s \n" +
                "", getId(), this.getTaskDate(), this.priority, this.handler, this.description, this.done);
    }

}
