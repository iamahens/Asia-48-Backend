package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.PlannerTask;
import com.asia48.asia48_backend.Repository.PlannerTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlannerService {

    @Autowired
    private PlannerTaskRepository plannerTaskRepository;

    public List<PlannerTask> getRelevantTasks(String country, String courseLevel) {
        return plannerTaskRepository.findRelevantTasks(country, courseLevel);
    }

    public PlannerTask createTask(PlannerTask task) {
        // In a real app, you might add more logic here before saving
        return plannerTaskRepository.save(task);
    }
}
