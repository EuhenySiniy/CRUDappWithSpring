package com.yevhensynii.service;

import com.yevhensynii.model.CourseEntity;

import java.util.List;

public interface CourseEntityService {
    CourseEntity addCourse(CourseEntity course);

    void deleteCourse(long id);

    CourseEntity getById(Long id);

    CourseEntity editCourse(CourseEntity course);

    List<CourseEntity> getAll();
}
