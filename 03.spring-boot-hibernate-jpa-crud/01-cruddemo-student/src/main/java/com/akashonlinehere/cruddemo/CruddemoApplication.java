package com.akashonlinehere.cruddemo;

import com.akashonlinehere.cruddemo.dao.StudentDAO;
import com.akashonlinehere.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){   // injecting StudentDAO
		return runner -> {
			// createStudent(studentDAO);
			// createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			queryForStudentsByLastName(studentDAO);
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudent = studentDAO.findByLastName("Dow");
		// display list of students
		for(Student tempStudent: theStudent){
			System.out.println(tempStudent);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		//  get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display a list of students
		for(Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Daffy", "Baffy", "daffy@gmail.com");

		// save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved Student's Generated id: "+theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: "+tempStudent.getId());
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: "+myStudent);

	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 students object...");
		Student tempStudent1 = new Student("John", "Dow", "john@gmail.com");
		Student tempStudent2 = new Student("Mary", "Curie", "mary@gmail.com");
		Student tempStudent3 = new Student("Harry", "Potter", "harry@gmail.com");

		// save student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	public void createStudent(StudentDAO studentDAO){
		// create student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Akash", "Shridharan", "akash@gmail.com");

		// save student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of saved student
		System.out.println("Saved student's Generated Id: "+tempStudent.getId());

	}

}
