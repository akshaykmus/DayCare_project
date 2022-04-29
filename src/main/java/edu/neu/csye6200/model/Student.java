/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author eswar
 */
public class Student {

	private int studentId;
        private int parentId;
	private String studentName;
	private int age;
	private String dateofBirth;
	private double gpa;

	{
		studentId = -1;
		studentName = "";
		age = -1;
		dateofBirth = "";
		gpa = 0.0;

	}

	public Student(int studentId, String studentName, int age, String dateofBirth, double gpa) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.dateofBirth = dateofBirth;
		this.gpa = gpa;
	}

	public Student(String studentName, String dateOfBirth, int age) {
		super();
		this.studentName = studentName;
		this.dateofBirth = dateOfBirth;
		this.age = age;

	}

	public Student() {
		super();

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
        
        

	public String generateRegisterQuery() {
		return "INSERT INTO student (name, dob, age,parent_id) VALUES(" + this.studentName + ", " + this.dateofBirth + ", "
				+ this.age +", "+this.parentId+ ");";
	}
        
        public String generateStudentIdQuery(){
            return "SELECT student_id FROM student WHERE name="+this.studentName;
        }

}
