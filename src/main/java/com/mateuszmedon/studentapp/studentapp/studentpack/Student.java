package com.mateuszmedon.studentapp.studentapp.studentpack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    private Long id;
    private String firstName;
    private String surName;
    private int age;
    private String subject;
    private int grade;
}
