package com.yevhensynii.service.Implementation;

import com.yevhensynii.model.UserEntity;
import com.yevhensynii.repository.UserEntityRepository;
import com.yevhensynii.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityServiceImpl implements UserEntityService {
    @Autowired
    private UserEntityRepository userEntityRepository;

    @Override
    public UserEntity addUser(UserEntity user) {
        UserEntity savedUser = userEntityRepository.saveAndFlush(user);
        return savedUser;
    }

    @Override
    public void deleteUser(Long id) {
        userEntityRepository.deleteById(id);
    }

    @Override
    public UserEntity getById(Long id) {
        return userEntityRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity editUser(UserEntity user) {
        return userEntityRepository.saveAndFlush(user);
    }

    @Override
    public List<UserEntity> getAll() {
        return userEntityRepository.findAll();
    }
}
