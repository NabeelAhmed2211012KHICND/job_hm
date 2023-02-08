package com.job.job_hm.Model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "job_hm_and_interviewer")
public class JobHMAndInterviewers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Setter
    private Long jobId;
    @Setter
    private Long interviewerId;
    @Setter
    Long hmId;
}
