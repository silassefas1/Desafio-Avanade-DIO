package com.silassefas.services;

import com.silassefas.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
