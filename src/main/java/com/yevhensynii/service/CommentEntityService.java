package com.yevhensynii.service;

import com.yevhensynii.model.CommentEntity;

import java.util.List;

public interface CommentEntityService {
    CommentEntity addComment(CommentEntity comment);

    void deleteComment(long id);

    CommentEntity getById(Long id);

    CommentEntity editComment(CommentEntity comment);

    List<CommentEntity> getAll();
}
