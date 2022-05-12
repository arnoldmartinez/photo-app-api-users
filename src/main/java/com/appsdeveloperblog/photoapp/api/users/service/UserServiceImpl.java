package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    @Override
    public UserDto CreateUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());

        return null;
    }
}
