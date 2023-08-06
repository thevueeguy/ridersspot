package com.sharad.ridersspot.controller;

import com.sharad.ridersspot.collection.Credentials;
import com.sharad.ridersspot.collection.Token;
import com.sharad.ridersspot.collection.dto.UserDTO;
import com.sharad.ridersspot.exception.UserAlreadyExistsException;
import com.sharad.ridersspot.service.AuthenticationService;
import com.sharad.ridersspot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    ResponseEntity<Token> register(@RequestBody UserDTO userDTO) throws UserAlreadyExistsException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("description", "User has been registered");
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(authenticationService.register(userDTO));
    }

    @PostMapping("/authenticate")
    ResponseEntity<Token> authenticate(@RequestBody Credentials credentials) throws UsernameNotFoundException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("description", "User has been registered");
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(authenticationService.authenticate(credentials));
    }

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }

}
