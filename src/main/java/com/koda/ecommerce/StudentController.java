package com.koda.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @GetMapping("/students/{student_id}")
    public Student getStudent(@PathVariable int student_id) {
        return repository.findById(student_id).orElse(new Student());
    }

    @DeleteMapping("/students/{student_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable int student_id){
        repository.deleteById(student_id);
    }

    

    @GetMapping("/students/search/{student_name}")
    public List<Student> getStudentByName(@PathVariable String student_name) {
        return repository.findAllByFirstNameContaining(student_name);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }


    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "You just called the POST method at '/post'!\n: " +message;
    }


}

