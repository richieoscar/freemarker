package com.example.freemarker.controller;

import com.example.freemarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = List.of(
                new Student(1, "Maria Jones", "A"),
                new Student(2, "Anthony Marker", "B"),
                new Student(3, "Wander Huton", "A"),
                new Student(4, "Lovelyn Summer", "C"),
                new Student(5, "kate Hensh", "A"),
                new Student(6, "Paul Sailer", "A"),
                new Student(7, "JOhn Jones", "A")

        );
        model.addAttribute("list", list);
        return "list";
    }


}
