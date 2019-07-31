package com.yevhensynii.repository;

import com.yevhensynii.model.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionEntityRepository extends JpaRepository<SectionEntity, Long> {
}
