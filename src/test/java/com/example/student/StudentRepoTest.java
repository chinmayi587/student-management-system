package com.example.student;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentRepoTest {

    @Autowired
    StudentRepository repo;


    @Test
    public void testGetAll() {

        List<Student> list = repo.findAll();

        assertThat(list).size().isGreaterThan(0);
    }

  
    @Test
    public void testGetStudent() {

        Student s = repo.findById(3).orElseThrow();

        
        assertThat(s.getId()).isEqualTo(3);
    }

   
    @Test
    public void testAddStudent() {

        Student s = new Student();

        s.setId(4);
        s.setName("SUDARSHAN");
        s.setAge(20);
        s.setBranch("CSE");
        s.setMarks(85);

        repo.save(s);

        
        assertThat(s.getName()).isEqualTo("SUDARSHAN");
        assertThat(s.getAge()).isEqualTo(20);
        assertThat(s.getBranch()).isEqualTo("CSE");
        assertThat(s.getMarks()).isEqualTo(85);
    }

   
    @Test
    public void testUpdate() {

        Student s = repo.findById(3).orElseThrow();

        s.setName("DEEKSHA");
        s.setAge(21);
        s.setBranch("ISE");
        s.setMarks(90);

        repo.save(s);

        
        assertThat(s.getName()).isEqualTo("DEEKSHA");
        assertThat(s.getAge()).isEqualTo(21);
        assertThat(s.getBranch()).isEqualTo("ISE");
        assertThat(s.getMarks()).isEqualTo(90);
    }

    
    @Test
    public void testDelete() {

        repo.deleteById(4);

        assertThat(repo.findById(3)).isEmpty();
    }
}