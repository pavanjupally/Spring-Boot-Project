package com.bootProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "roll_number")
	private int roll_number;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "marks_maths")
	private int marks_maths;
	
	@Column(name = "marks_social")
	private int marks_social;
	
	@Column(name = "marks_physics")
	private int marks_physics;
	
	@Column(name = "marks_biology")
	private int marks_biology;
	
	@Column(name = "marks_english")
	private int marks_english;
	
	@Column(name = "marks_chemistry")
	private int marks_chemistry;

	public Student() {
		super();
	}

	public Student(int roll_number, String first_name, String last_name, String email, int marks_maths,
			int marks_social, int marks_physics, int marks_biology, int marks_english, int marks_chemistry) {
		super();
		this.roll_number = roll_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.marks_maths = marks_maths;
		this.marks_social = marks_social;
		this.marks_physics = marks_physics;
		this.marks_biology = marks_biology;
		this.marks_english = marks_english;
		this.marks_chemistry = marks_chemistry;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks_maths() {
		return marks_maths;
	}

	public void setMarks_maths(int marks_maths) {
		this.marks_maths = marks_maths;
	}

	public int getMarks_social() {
		return marks_social;
	}

	public void setMarks_social(int marks_social) {
		this.marks_social = marks_social;
	}

	public int getMarks_physics() {
		return marks_physics;
	}

	public void setMarks_physics(int marks_physics) {
		this.marks_physics = marks_physics;
	}

	public int getMarks_biology() {
		return marks_biology;
	}

	public void setMarks_biology(int marks_biology) {
		this.marks_biology = marks_biology;
	}

	public int getMarks_english() {
		return marks_english;
	}

	public void setMarks_english(int marks_english) {
		this.marks_english = marks_english;
	}

	public int getMarks_chemistry() {
		return marks_chemistry;
	}

	public void setMarks_chemistry(int marks_chemistry) {
		this.marks_chemistry = marks_chemistry;
	}

	
	
}
