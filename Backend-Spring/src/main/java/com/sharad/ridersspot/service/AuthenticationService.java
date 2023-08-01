package com.sharad.ridersspot.service;

import com.sharad.ridersspot.collection.Credentials;
import com.sharad.ridersspot.collection.Token;
import com.sharad.ridersspot.collection.dto.UserDTO;

public interface AuthenticationService {
    public Token register(UserDTO userDTO);
    public Token authenticate(Credentials credentials);
}
