package com.mateuszmedon.studentapp.studentapp.student;

import com.mateuszmedon.studentapp.studentapp.student.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {


}
