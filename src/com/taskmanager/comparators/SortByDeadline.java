package com.taskmanager.comparators;

import com.taskmanager.model.Task;

import java.util.Comparator;

public class SortByDeadline implements Comparator<Task> {
    public int compare(Task t1, Task t2){
        return t1.getDeadline()-t2.getDeadline();
    }
}
