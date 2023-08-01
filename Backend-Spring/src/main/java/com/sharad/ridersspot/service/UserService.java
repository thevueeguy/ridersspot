package com.sharad.ridersspot.service;

import com.sharad.ridersspot.collection.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO editUser(UserDTO userDTO);
    void deleteUser(String userId);
    UserDTO getById(String userId);
    List<UserDTO> getAll();
}
