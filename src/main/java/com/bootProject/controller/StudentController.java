package com.bootProject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootProject.model.Student;
import com.bootProject.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@RequestMapping("/studentname")
	public String returnStudentName() {
		return "{name:Pavan}";
	}

	@RequestMapping("/getStudentDetails/{id}")
	@ResponseBody
	public Student getUserDetails(@PathVariable("id") int roll) {

		Optional<Student> u = studentRepository.findById(roll);

		if (u.isPresent()) {
			return u.get();
		} else {
			return new Student();
		}
	}

	@RequestMapping("/getAll")
	@ResponseBody
	public List<Student> getAll() {

		Iterable<Student> tempStudent = studentRepository.findAll();
		
		List<Student> allUsers = new ArrayList<Student>();
		for(Student u: tempStudent){
			allUsers.add(u);
		}

		return allUsers;
	}
}