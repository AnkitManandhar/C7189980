package com.example.todomvvm.tasks;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todomvvm.database.Repository;
import com.example.todomvvm.database.TaskEntry;

import java.util.List;

public class Deletemodel extends AndroidViewModel {
    Repository repository;
    private LiveData<List<TaskEntry>> tasks;

    public Deletemodel(@NonNull Application application) {
        super(application);
        repository = Repository.getInstance(application);
    }
    public void deleteAllTasks(){
        repository.deleteAllTasks();
    }

}