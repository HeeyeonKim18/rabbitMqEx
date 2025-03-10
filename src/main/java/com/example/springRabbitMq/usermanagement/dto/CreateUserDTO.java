package com.example.springRabbitMq.usermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO {

    private String name;
    private String email;
    private String address;
    private String phoneNumber;
}
