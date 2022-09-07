package com.post.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.app.entity.JobPost;

public interface JobPostRepo extends JpaRepository<JobPost,Integer>  {

}
