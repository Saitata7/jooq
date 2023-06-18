package com.example.jooq;

import com.example.jooq.sample.tables.pojos.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StuController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStu(){
        return studentService.getStud();
    }


    @PostMapping("/student")
    public String postStu(@RequestBody Student student){
        studentService.insertUser(student);
        return "inserted data";
    }
}
