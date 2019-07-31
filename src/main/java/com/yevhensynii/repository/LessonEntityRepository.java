package com.yevhensynii.repository;

import com.yevhensynii.model.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonEntityRepository extends JpaRepository<LessonEntity, Long> {
}
