package com.yevhensynii.repository;

import com.yevhensynii.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEntityRepository extends JpaRepository<CourseEntity, Long> {
}
