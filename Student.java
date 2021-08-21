package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Name of the student");
	}

	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Department of the student");
	}

	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Id of the student");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentId();
		student.studentDept();
	}

}
