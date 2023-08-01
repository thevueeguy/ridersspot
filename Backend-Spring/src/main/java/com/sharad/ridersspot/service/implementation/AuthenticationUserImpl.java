package com.sharad.ridersspot.service.implementation;

import com.sharad.ridersspot.collection.Credentials;
import com.sharad.ridersspot.collection.Role;
import com.sharad.ridersspot.collection.Token;
import com.sharad.ridersspot.collection.User;
import com.sharad.ridersspot.collection.dto.UserDTO;
import com.sharad.ridersspot.collection.mapper.UserMapper;
import com.sharad.ridersspot.repository.UserRepository;
import com.sharad.ridersspot.service.AuthenticationService;
import com.sharad.ridersspot.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationUserImpl implements AuthenticationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserMapper userMapper;
    @Override
    public Token register(UserDTO userDTO) {
        User user = User
                        .builder()
                        .id(userDTO.getId())
                        .name(userDTO.getName())
                        .email(userDTO.getEmail())
                        .password(passwordEncoder.encode(userDTO.getPassword()))
                        .role(Role.USER).build();

        userRepository.insert(user);
        String jwtToken = jwtService.generateToken(user);
        return Token
                .builder()
                .token(jwtToken)
                .build();
    }

    @Override
    public Token authenticate(Credentials credentials) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        credentials.getEmail(),
                        credentials.getPassword()
                )
        );
        User user = userRepository.findByEmail(credentials.getEmail()).orElseThrow();
        String jwtToken = jwtService.generateToken(user);
        return Token
                .builder()
                .token(jwtToken)
                .build();
    }
}
