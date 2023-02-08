package com.job.job_hm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.job_hm.Model.JobHMAndInterviewers;
import com.job.job_hm.Repository.IJobHMAndInterviewersRepository;

@RestController
@RequestMapping("/job")
public class JobHMAndInterviwersController {

    @Autowired
    IJobHMAndInterviewersRepository repo;

    @GetMapping("/get")
    public List<JobHMAndInterviewers> getData() {
        return repo.findAll();
    }

    @GetMapping("/findByJob/{jobId}")
    public List<JobHMAndInterviewers> getByJobId(@PathVariable Long jobId) {
    return repo.findByJobId(jobId);
    }

    @GetMapping("/{id}")
    public JobHMAndInterviewers getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/post")
    public void saveJob(@RequestBody JobHMAndInterviewers jobModel) {
        repo.save(jobModel);
    }

    @PutMapping("/update")
    public JobHMAndInterviewers updatejob(@RequestBody JobHMAndInterviewers jobModel) {
        return repo.save(jobModel);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        repo.deleteById(id);
    }

}
