package com.mateuszmedon.studentapp.studentapp.student.exceptions;

public class StudentInvalidException extends RuntimeException {
    public StudentInvalidException(Long id){
        super("Student withe id " + id + " not found");
    }
}
