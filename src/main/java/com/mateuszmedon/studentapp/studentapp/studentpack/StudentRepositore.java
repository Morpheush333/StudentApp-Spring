package com.mateuszmedon.studentapp.studentapp.studentpack;

import java.util.List;
import java.util.Optional;

public interface StudentRepositore {

    Optional<Student> findById(Long id);
    List<Student> findAll();
    void save(Long id);
}
