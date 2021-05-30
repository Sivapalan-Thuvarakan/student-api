package com.example.student.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository= new InMemoryStudentRepository();
    //Rest Endpoints
    //Create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student)
    {
        //todo:logic to save the student in database
        repository.save(student);
    }
    //Delete a student
    //Update a student
    //Retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }
}
