package com.practice.practice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.practice.dto.Student;
import com.practice.practice.entity.StudentEntity;
import com.practice.practice.repo.StudentRepo;
import com.practice.practice.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;

	@Override
	public String saveStudent(Student request) {
		StudentEntity student = new StudentEntity();
		student.setName(request.getName());
		student.setAge(request.getAge());
		repo.save(student);
		return "Data saved successfully";
	}

}
