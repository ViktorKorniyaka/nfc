package com.nfc.user.repository;

import com.nfc.user.model.User;

public interface UserRepository {
    public User getUser(Long id);
}
