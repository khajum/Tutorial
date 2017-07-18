package com.ram.DataAccessObjectPattern;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		//print all students
		for(Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo: "+student.getRollNo()+" Name: "+student.getName()+"]");
		}
		
		//update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Mark");
		studentDao.updateStudent(student);
		
		//get the student
		student = studentDao.getStudent(20);
		System.out.println("Student: [RollNo: "+student.getName()+" Name:"+student.getRollNo()+"]");

	}

}
