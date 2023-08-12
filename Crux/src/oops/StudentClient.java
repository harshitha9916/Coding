package oops;

import javax.annotation.processing.AbstractProcessor;

public class StudentClient {

	public static void main(String[] args) throws Exception {
	/*	Student[] students = new Student[1000];
		for(int i=0;i<students.length;i++) {
			students[i] = new Student(i + "th");
			System.out.println(Student.getNoOfStudents());
		}
	//Student.MaxStudents=2000;
	//	students[250].rollNo=10;
		System.out.println(students[250].rollNo);
		System.out.println(students[250].getName());
		students[250].setName("ABC");
		System.out.println(students[250].getName());
		
		students[250].StaticFunction();
		students[250].NonStaticFunction();
		Student.StaticFunction();
		
		students[250].SetUniformColor("Blue");
		System.out.println(students[550].getUniformColor());
		*/
		//code below for exception handling
		Student s1 = new Student("S");
		try {
		s1.setAge(-10); 
		System.out.println("After statemnet");//will not execute
		}
		catch(Exception e) {
		System.out.println("in catch");
		}
		System.out.println("statement after catch");
		System.out.println(s1.getAge());
		
		

	}
	}
	
