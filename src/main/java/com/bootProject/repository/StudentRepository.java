package com.bootProject.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.bootProject.model.Student;


@Transactional
public interface StudentRepository extends CrudRepository<Student,Integer>{

}