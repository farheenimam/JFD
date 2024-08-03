package com.example.Job_Finder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;

    public List<Job> getAllJob(){
        return jobRepo.findAll();
    }
    public List<Job> getJobsByLocation(String location){
        return jobRepo.findJobsByLocation(location);
    }
}
