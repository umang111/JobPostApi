package com.post.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.app.entity.Company;

public interface CompanyRepo extends JpaRepository<Company,Integer>{

}
