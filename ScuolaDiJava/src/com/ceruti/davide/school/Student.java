package com.ceruti.davide.school;

public class Student extends Person {
	//instance variable
	private static final int MAX_COURSES=30; 
    private String[] courses;
    private int[] grades;
    private int numCourses;
	
	
	
	//constructors
	public Student(String name, String address){		
	super(name,address);
	this.setNumCourses(0);
	this.setGrades(new int[MAX_COURSES]);
	this.setCourses(new String[MAX_COURSES]);
		
	}	
	public Student() {
		// TODO Auto-generated constructor stub
		super("", "");
		this.setNumCourses(0);
		this.setGrades(new int[MAX_COURSES]);
		this.setCourses(new String[MAX_COURSES]);		
	}
	public int getNumCourses() {
		return numCourses;
	}
	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	

}
