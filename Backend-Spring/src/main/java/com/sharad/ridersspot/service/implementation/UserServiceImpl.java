package com.sharad.ridersspot.service.implementation;

import com.sharad.ridersspot.collection.User;
import com.sharad.ridersspot.collection.dto.UserDTO;
import com.sharad.ridersspot.collection.mapper.UserMapper;
import com.sharad.ridersspot.repository.UserRepository;
import com.sharad.ridersspot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    private List<UserDTO> convertToUsersList(List<User> users) {
        return users.stream().map(user -> userMapper.convertToDTO(user)).toList();
    }
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.convertToDocument(userDTO);
        user = userRepository.insert(user);

        return userMapper.convertToDTO(user);
    }
    @Override
    public UserDTO editUser(UserDTO userDTO) {
        User user = userMapper.convertToDocument(userDTO);
        user = userRepository.save(user);

        return userMapper.convertToDTO(user);    }
    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
    @Override
    public UserDTO getById(String userId) {
        return null;
    }
    @Override
    public List<UserDTO> getAll() {
        return null;
    }
}
