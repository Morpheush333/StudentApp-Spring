package com.mateuszmedon.studentapp.studentapp.student.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    @Enumerated(EnumType.STRING)
    private Subject subject;
    private int grade;

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
