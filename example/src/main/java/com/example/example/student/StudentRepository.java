package com.example.example.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
                extends JpaRepository<Student, Long> {

        // @Query("SELECT s FROM STUDENT s WHERE s.email=?1")
        Optional<Student> findStudentByEmail(String email);

}
