package com.example.Job_Finder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepo extends JpaRepository<Job, Long> {
    @Query("SELECT j FROM Job j WHERE j.location = :location")
    List<Job> findJobsByLocation(@Param("location") String location);

}
