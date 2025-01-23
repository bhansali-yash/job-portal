package com.luv2code.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.jobportal.entity.JobPostActivity;
import com.luv2code.jobportal.entity.JobSeekerProfile;
import com.luv2code.jobportal.entity.JobSeekerSave;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

	List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

	List<JobSeekerSave> findByJob(JobPostActivity job);

}
