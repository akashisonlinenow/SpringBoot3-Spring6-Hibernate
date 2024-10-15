package com.akashonlinehere.cruddemo;

import com.akashonlinehere.cruddemo.dao.StudentDAO;
import com.akashonlinehere.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){   // injecting StudentDAO
		return runner -> {
			createStudent(studentDAO);
		};
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
