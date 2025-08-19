package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.PlannerTask;
import com.asia48.asia48_backend.service.PlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planner")
public class PlannerController {

    @Autowired
    private PlannerService plannerService;

    @GetMapping("/tasks")
    public ResponseEntity<List<PlannerTask>> getPlannerTasks(
            @RequestParam String country,
            @RequestParam String courseLevel) {
        List<PlannerTask> tasks = plannerService.getRelevantTasks(country, courseLevel);
        return ResponseEntity.ok(tasks);
    }

    // This endpoint would be secured for admins in a real application
    @PostMapping("/tasks")
    public ResponseEntity<PlannerTask> createTask(@RequestBody PlannerTask task) {
        return ResponseEntity.ok(plannerService.createTask(task));
    }
}
