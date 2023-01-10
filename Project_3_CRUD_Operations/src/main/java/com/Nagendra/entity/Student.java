package com.Nagendra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String SName;
	private int Marks;
	public int getId() {	
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public Student(int id, String sName, int marks) {
		super();
		this.id = id;
		SName = sName;
		Marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", SName=" + SName + ", Marks=" + Marks + "]";
	}
	
	

	

}
