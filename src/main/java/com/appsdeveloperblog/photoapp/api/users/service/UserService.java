package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

public interface UserService {
    UserDto CreateUser(UserDto userDetails);
}
