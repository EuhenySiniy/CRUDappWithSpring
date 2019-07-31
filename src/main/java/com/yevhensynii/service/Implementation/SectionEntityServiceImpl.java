package com.yevhensynii.service.Implementation;

import com.yevhensynii.model.SectionEntity;
import com.yevhensynii.repository.SectionEntityRepository;
import com.yevhensynii.service.SectionEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionEntityServiceImpl implements SectionEntityService {
    @Autowired
    private SectionEntityRepository sectionEntityRepository;

    @Override
    public SectionEntity addSection(SectionEntity section) {
        SectionEntity savedSection = sectionEntityRepository.saveAndFlush(section);
        return savedSection;
    }

    @Override
    public void deleteSection(Long id) {
        sectionEntityRepository.deleteById(id);
    }

    @Override
    public SectionEntity getById(Long id) {
        return sectionEntityRepository.findById(id).orElse(null);
    }

    @Override
    public SectionEntity editSection(SectionEntity section) {
        return sectionEntityRepository.saveAndFlush(section);
    }

    @Override
    public List<SectionEntity> getAll() {
        return sectionEntityRepository.findAll();
    }
}
