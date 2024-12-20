package com.microservice.student.service;

import com.microservice.student.entities.Student;
import com.microservice.student.persistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return repository.findAllStudent(idCourse);
    }
}
