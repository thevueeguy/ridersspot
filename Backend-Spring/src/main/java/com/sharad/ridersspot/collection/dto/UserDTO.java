package com.sharad.ridersspot.collection.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sharad.ridersspot.collection.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String name;
    private String email;
    private String password;
    private Role role;
}
