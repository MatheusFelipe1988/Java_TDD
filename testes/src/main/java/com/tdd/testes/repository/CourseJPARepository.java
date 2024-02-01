package com.tdd.testes.repository;

import com.tdd.testes.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseJPARepository implements ICourseRepository{
    @Autowired
    private CourseRepository repository;

    @Override
    public Course findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public Course save(Course course) {
        return this.repository.save(course);
    }
}
