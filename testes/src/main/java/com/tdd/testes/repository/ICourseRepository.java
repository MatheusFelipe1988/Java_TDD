package com.tdd.testes.repository;

import com.tdd.testes.domain.Course;

public interface ICourseRepository {
    public Course findByName(String name);
    public Course save(Course course);
}
