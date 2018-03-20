package com.cisc181.core;

public class Enrollment {
	private int SectionID;
	private int StudentID;
	private int EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		SectionID=0;
		StudentID=0;
		EnrollmentID=0;
		Grade=0.0;
	}
	
	public Enrollment(int SectionId,int StudentID){
		this.SectionID=SectionID;
		this.StudentID=StudentID;
		this.EnrollmentID=1234;
	}
	public int getSectionID() {
		return SectionID;
	}
	public void setSectionID(int sectionID) {
		SectionID = sectionID;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(int enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	
}
