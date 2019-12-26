package com.nfc.user.repository;

import com.nfc.user.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User getUser(Long id) {
        return null;
    }
}
