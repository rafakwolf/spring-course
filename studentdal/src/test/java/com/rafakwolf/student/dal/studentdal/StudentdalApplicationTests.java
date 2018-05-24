package com.rafakwolf.student.dal.studentdal;

import com.rafakwolf.student.dal.studentdal.com.rafakwolf.student.dal.entities.Student;
import com.rafakwolf.student.dal.studentdal.com.rafakwolf.student.dal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

    private static Long _id = 1L;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Web Services");
        student.setFee(30d);

        studentRepository.save(student);
    }

    @Test
    public void testFindStudentById(){
        Optional<Student> student = studentRepository.findById(_id);
        System.out.println(student.get());
    }

    @Test
    public void testUpdateStudent(){
        Optional<Student> student = studentRepository.findById(_id);
        student.get().setFee(40d);

        studentRepository.save(student.get());
    }

    @Test
    public void testDeleteStudent(){
        studentRepository.deleteById(_id);
    }

}
