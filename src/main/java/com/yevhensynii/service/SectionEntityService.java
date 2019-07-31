package com.yevhensynii.service;

import com.yevhensynii.model.SectionEntity;

import java.util.List;

public interface SectionEntityService {
    SectionEntity addSection(SectionEntity section);

    void deleteSection(Long id);

    SectionEntity getById(Long id);

    SectionEntity editSection(SectionEntity section);

    List<SectionEntity> getAll();
}
