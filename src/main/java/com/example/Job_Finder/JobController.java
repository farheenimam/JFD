package com.example.Job_Finder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public String fetchListOfJobs(@RequestParam(value = "location", defaultValue = "Remote")String location, Model model){
        List<Job> jobs = jobService.getJobsByLocation(location);
        model.addAttribute("jobs", jobs);
        model.addAttribute("location", location);
        return "Home";
    }
    @GetMapping("/all-jobs")
    public String showAllJobs(Model model){
        List<Job> jobs = jobService.getAllJob();
        model.addAttribute("jobs", jobs);
        return "all";
    }
}
