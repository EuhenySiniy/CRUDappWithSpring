package com.yevhensynii.service.Implementation;

import com.yevhensynii.model.CourseEntity;
import com.yevhensynii.repository.CourseEntityRepository;
import com.yevhensynii.service.CourseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseEntityServiceImpl implements CourseEntityService {
    @Autowired
    private CourseEntityRepository courseEntityRepository;

    @Override
    public CourseEntity addCourse(CourseEntity course) {
        CourseEntity savedCourse = courseEntityRepository.saveAndFlush(course);
        return savedCourse;
    }

    @Override
    public void deleteCourse(long id) {
        courseEntityRepository.deleteById(id);
    }

    @Override
    public CourseEntity getById(Long id) {
        return courseEntityRepository.findById(id).orElse(null);
    }

    @Override
    public CourseEntity editCourse(CourseEntity course) {
        return courseEntityRepository.saveAndFlush(course);
    }

    @Override
    public List<CourseEntity> getAll() {
        return courseEntityRepository.findAll();
    }
}
