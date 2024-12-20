package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;
import java.util.Optional;

public interface ICourseService {

    List<Course> findByAll();
    Course findById(Long id);
    void save(Course course);
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
