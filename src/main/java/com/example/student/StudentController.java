package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping("/getAll")
    public List<Student> getAll() {
        return repo.findAll();
    }

    @GetMapping("/get")
    public Student getById(@RequestParam("id") Integer id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        repo.save(student);
        return "Inserted successfully";
    }

    @PutMapping("/update")
    public String updateById(@RequestParam("id") Integer id,
                             @RequestBody Student student) {

        Student ustudent = repo.findById(id).orElseThrow();

        ustudent.setName(student.getName());
        ustudent.setAge(student.getAge());
        ustudent.setBranch(student.getBranch());
        ustudent.setMarks(student.getMarks());

        repo.save(ustudent);

        return "Updated successfully";
    }

    @DeleteMapping("/delete")
    public String deleteById(@RequestParam("id") Integer id) {

        repo.delete(repo.findById(id).orElseThrow());

        return "Deleted successfully";
    }
}