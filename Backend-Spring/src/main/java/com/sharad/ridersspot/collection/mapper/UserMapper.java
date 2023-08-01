package com.sharad.ridersspot.collection.mapper;

import com.sharad.ridersspot.collection.User;
import com.sharad.ridersspot.collection.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User convertToDocument(UserDTO userDTO) {
        return User.builder()
                    .id(userDTO.getId())
                    .email(userDTO.getEmail())
                    .name(userDTO.getName())
                    .password(userDTO.getPassword())
                    .role(userDTO.getRole())
                    .build();
    }

    public UserDTO convertToDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
    }
}
