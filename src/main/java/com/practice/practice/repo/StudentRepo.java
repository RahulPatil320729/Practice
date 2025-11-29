package com.practice.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.practice.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
