package com.nfc.user.service;

import com.nfc.user.model.User;
import com.nfc.user.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.getUser(id);
    }
}
