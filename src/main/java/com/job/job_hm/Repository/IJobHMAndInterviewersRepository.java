package com.job.job_hm.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.job_hm.Model.JobHMAndInterviewers;

public interface IJobHMAndInterviewersRepository extends JpaRepository<JobHMAndInterviewers,Long>{

 public List<JobHMAndInterviewers> findByJobId(Long jobId);
}
 