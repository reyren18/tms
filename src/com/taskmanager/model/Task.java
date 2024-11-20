package com.taskmanager.model;

public enum Status{
    PENDING, COMPLETED
}

public enum Priority{
    HIGH,LOW,MEDIUM
}

public class Task {
    private int taskId;
    private String taskName;
    private String description;
    private Priority priority;
    private Status status;
    private int deadline;

    public Task(int id, String name, String desc, int deadline){
        this.taskId = id;
        this.taskName = name;
        this.description = desc;
        this.deadline = deadline;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}
