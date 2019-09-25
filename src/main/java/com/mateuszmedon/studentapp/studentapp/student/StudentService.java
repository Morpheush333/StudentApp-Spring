package com.mateuszmedon.studentapp.studentapp.student;


import com.mateuszmedon.studentapp.studentapp.student.entities.Student;
import com.mateuszmedon.studentapp.studentapp.student.exceptions.StudentInvalidException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService (StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        if(id == null && id<=0){
            throw new IllegalArgumentException(id + "invalid");
        }
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentInvalidException(id));
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
