package com.yevhensynii.service.Implementation;

import com.yevhensynii.model.LessonEntity;
import com.yevhensynii.repository.LessonEntityRepository;
import com.yevhensynii.service.LessonEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonEntityServiceImpl implements LessonEntityService {
    @Autowired
    private LessonEntityRepository lessonEntityRepository;

    @Override
    public LessonEntity addLesson(LessonEntity lesson) {
        LessonEntity savedLesson = lessonEntityRepository.saveAndFlush(lesson);
        return savedLesson;
    }

    @Override
    public void deleteLesson(long id) {
        lessonEntityRepository.deleteById(id);
    }

    @Override
    public LessonEntity getById(Long id) {
        return lessonEntityRepository.findById(id).orElse(null);
    }

    @Override
    public LessonEntity editLesson(LessonEntity lesson) {
        return lessonEntityRepository.saveAndFlush(lesson);
    }

    @Override
    public List<LessonEntity> getAll() {
        return lessonEntityRepository.findAll();
    }
}
