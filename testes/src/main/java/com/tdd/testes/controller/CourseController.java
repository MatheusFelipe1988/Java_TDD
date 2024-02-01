package com.tdd.testes.controller;

import com.tdd.testes.domain.Course;
import com.tdd.testes.repository.CourseJPARepository;
import com.tdd.testes.service.CreateCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CourseController {

    @Autowired
    private CourseJPARepository repository;

    @PostMapping
    public Course createCourse(@RequestBody Course course){
        CreateCourseService createCourseService = new CreateCourseService(repository);
        return createCourseService.execute(course);

    }
}
