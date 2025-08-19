package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.PlannerTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlannerTaskRepository extends JpaRepository<PlannerTask, Long> {


    @Query("SELECT p FROM PlannerTask p WHERE (p.countryFilter = 'All' OR p.countryFilter = :country) AND (p.courseLevelFilter = 'All' OR p.courseLevelFilter = :courseLevel) ORDER BY p.timelineMonths DESC")
    List<PlannerTask> findRelevantTasks(@Param("country") String country, @Param("courseLevel") String courseLevel);
}
