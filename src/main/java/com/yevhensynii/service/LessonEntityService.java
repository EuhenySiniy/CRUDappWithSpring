package com.yevhensynii.service;

import com.yevhensynii.model.LessonEntity;

import java.util.List;

public interface LessonEntityService {
    LessonEntity addLesson(LessonEntity lesson);

    void deleteLesson(long id);

    LessonEntity getById(Long id);

    LessonEntity editLesson(LessonEntity lesson);

    List<LessonEntity> getAll();
}
