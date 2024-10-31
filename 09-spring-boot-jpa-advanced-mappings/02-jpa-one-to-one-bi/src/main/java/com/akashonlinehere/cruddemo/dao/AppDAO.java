package com.akashonlinehere.cruddemo.dao;

import com.akashonlinehere.cruddemo.entity.Instructor;
import com.akashonlinehere.cruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
