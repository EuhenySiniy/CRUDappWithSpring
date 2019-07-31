package com.yevhensynii.service.Implementation;

import com.yevhensynii.model.CommentEntity;
import com.yevhensynii.repository.CommentEntityRepository;
import com.yevhensynii.service.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityServiceImpl implements CommentEntityService {
    @Autowired
    private CommentEntityRepository commentEntityRepository;

    @Override
    public CommentEntity addComment(CommentEntity comment) {
        CommentEntity savedComment = commentEntityRepository.saveAndFlush(comment);
        return savedComment;
    }

    @Override
    public void deleteComment(long id) {
        commentEntityRepository.deleteById(id);
    }

    @Override
    public CommentEntity getById(Long id) {
        return commentEntityRepository.findById(id).orElse(null);
    }

    @Override
    public CommentEntity editComment(CommentEntity comment) {
        return commentEntityRepository.saveAndFlush(comment);
    }

    @Override
    public List<CommentEntity> getAll() {
        return commentEntityRepository.findAll();
    }
}
