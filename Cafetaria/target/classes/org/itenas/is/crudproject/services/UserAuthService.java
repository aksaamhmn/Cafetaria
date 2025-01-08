package org.itenas.is.crudproject.services;

import org.itenas.is.crudproject.model.User;

public interface UserAuthService {
    public User authenticateUser(User user);
    public User registerUser (User user);
}