package com.tdd.testes.service;

import com.tdd.testes.domain.Course;
import com.tdd.testes.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseService {
    @Autowired
    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository) {
        this.repository = repository;
    }


    public Course execute(Course course){
        Course existCourse = this.repository.findByName(course.getName());

        if (existCourse != null){
            throw new Error("Ja existe");
        }

        return this.repository.save(course);

    }
}
