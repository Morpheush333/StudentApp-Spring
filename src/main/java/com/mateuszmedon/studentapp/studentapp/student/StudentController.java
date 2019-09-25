package com.mateuszmedon.studentapp.studentapp.student;


import com.mateuszmedon.studentapp.studentapp.student.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public ModelAndView students (){
        ModelAndView modelAndView = new ModelAndView("student/students-view");
        modelAndView.addObject("students",studentService.findAll());
        return modelAndView;
    }

    @GetMapping("/{studentId}")
    public ModelAndView studentById (@PathVariable("studentId") Long id){
        ModelAndView modelAndView = new ModelAndView("student/student-view");
        modelAndView.addObject("student", studentService.findById(id));
        return modelAndView;
    }

    @PostMapping
    public String saveStudent(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }















}
