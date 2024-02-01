package com.tdd.testes.repository;

import com.tdd.testes.domain.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class MemoryRepository implements ICourseRepository{
    private List<Course> courseList;

    public MemoryRepository(){
        this.courseList = new ArrayList<>();
    }

    @Override
    public Course findByName(String name) {
        Optional<Course> finalFirst = this.courseList.stream().filter(course ->
                course.getName().equals(name)).findFirst();
        return finalFirst.orElse(null);
    }

    @Override
    public Course save(Course course) {
        this.courseList.add(course);
        course.setId(UUID.randomUUID());
        return course;
    }
}
