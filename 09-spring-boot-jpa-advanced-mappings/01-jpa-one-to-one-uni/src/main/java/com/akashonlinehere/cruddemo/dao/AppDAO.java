package com.akashonlinehere.cruddemo.dao;

import com.akashonlinehere.cruddemo.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
