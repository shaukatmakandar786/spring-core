package com.mactech1;

public class Student {
	
	private int studentId;
	private String studentName;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

//	public Student()
//	{
//		
//	}
//
//	public Student(int studentId, String studentName) {
//		
//		this.studentId = studentId;
//		this.studentName = studentName;
//	}

	public void displayStudentInfo()
	{
		System.out.println("Student Id is  :"+studentId);
		System.out.println("Student Name is  :"+studentName);
		
	}

}
