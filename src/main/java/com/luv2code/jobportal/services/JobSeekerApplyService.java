package com.luv2code.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.jobportal.entity.JobPostActivity;
import com.luv2code.jobportal.entity.JobSeekerApply;
import com.luv2code.jobportal.entity.JobSeekerProfile;
import com.luv2code.jobportal.repository.JobSeekerApplyRepository;

@Service
public class JobSeekerApplyService {

	private final JobSeekerApplyRepository jobSeekerApplyRepository;

	public JobSeekerApplyService(JobSeekerApplyRepository jobSeekerApplyRepository) {
		super();
		this.jobSeekerApplyRepository = jobSeekerApplyRepository;
	}

	public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
		return jobSeekerApplyRepository.findByUserId(userAccountId);
	}

	public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
		return jobSeekerApplyRepository.findByJob(job);
	}

	public void addNew(JobSeekerApply jobSeekerApply) {
		jobSeekerApplyRepository.save(jobSeekerApply);
	}

}
