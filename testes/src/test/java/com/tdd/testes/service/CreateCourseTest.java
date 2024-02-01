package com.tdd.testes.service;
import com.tdd.testes.domain.Course;
import com.tdd.testes.repository.MemoryRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
public class CreateCourseTest {
    @Test
    public void should_be_able_to_create_a_new_course(){
        Course course = new Course();
        course.setDescricao("Curso_Descricao_Test");
        course.setName("Curso_Name");
        course.setWorkload(100);

        MemoryRepository repository = new MemoryRepository();

        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);

        assertNotNull(createdCourse.getId());
    }

    @Test
    public void should_not_be_able_to_create_a_new_course_if_exists(){
        Course course = new Course();
        course.setDescricao("Curso_Descricao_Test");
        course.setName("Curso_Name");
        course.setWorkload(100);

        MemoryRepository repository = new MemoryRepository();

        CreateCourseService createCourseService = new CreateCourseService(repository);
        createCourseService.execute(course);
        createCourseService.execute(course);

    }
}
