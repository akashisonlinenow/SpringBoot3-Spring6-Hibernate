package com.akashonlinehere.cruddemo;

import com.akashonlinehere.cruddemo.dao.AppDAO;
import com.akashonlinehere.cruddemo.entity.Instructor;
import com.akashonlinehere.cruddemo.entity.InstructorDetail;
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
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner -> {
			// createInstructor(appDAO);
			// findInstructor(appDAO);
			// deleteInstructor(appDAO);
			// findInstructorDetail(appDAO);
			 deleteInstructorDetail(appDAO);
		};
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int theId = 3;

		System.out.println("Deleting the instructor detail with id: "+theId);

		appDAO.deleteInstructorDetailById(theId);

		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		// get the instructor detail object
		int theId = 2;
		InstructorDetail instructorDetail = appDAO.findInstructorDetailById(theId);

		// print the instructor detail
		System.out.println("tempInstructorDetail: "+instructorDetail);

		// print the associated object
		System.out.println("the associated instructor: "+instructorDetail.getInstructor());

		System.out.println("Done!");
	}

	private void deleteInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Deleting the instructor id: "+theId);

		appDAO.deleteInstructorById(theId);

		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {
		int theId = 2;
		System.out.println("Finding instructor id: "+theId);

		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("TempInstructor: "+tempInstructor);

		System.out.println("The associated instructor detail: "+tempInstructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {
		/*
		// create the instructor
		Instructor tempInstructor = new Instructor("Akash", "Shridharan", "akash@gmail.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://luv2code.com/youtube",
				"Gyming"
		);

		 */

		// create the instructor
		Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhu@gmail.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://luv2code.com/youtube",
				"Guitar"
		);

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor (NOTE - this will also save the details object because of CascadeType.ALL)
		System.out.println("Saving the instructor: "+tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}
}
