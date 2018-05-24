package com.rafakwolf.student.dal.studentdal.com.rafakwolf.student.dal.repos;

import com.rafakwolf.student.dal.studentdal.com.rafakwolf.student.dal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
