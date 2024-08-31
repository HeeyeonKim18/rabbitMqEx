package com.example.springRabbitMq.usermanagement;

import com.example.springRabbitMq.usermanagement.dto.CreateUserDTO;
import com.example.springRabbitMq.usermanagement.dto.GenericResponseDTO;
import org.springframework.stereotype.Service;

public interface UserService {
    GenericResponseDTO saveUser(CreateUserDTO createUserDTO);

}
