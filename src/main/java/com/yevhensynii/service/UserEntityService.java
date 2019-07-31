package com.yevhensynii.service;

import com.yevhensynii.model.UserEntity;

import java.util.List;

public interface UserEntityService {
    UserEntity addUser(UserEntity user);

    void deleteUser(Long id);

    UserEntity getById(Long id);

    UserEntity editUser(UserEntity user);

    List<UserEntity> getAll();
}
