package com.example.springRabbitMq.usermanagement;

import com.example.springRabbitMq.usermanagement.dto.CreateUserDTO;
import com.example.springRabbitMq.usermanagement.dto.GenericResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("users/")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<GenericResponseDTO> registerUser(@RequestBody CreateUserDTO createUserDTO){
        GenericResponseDTO response = userService.saveUser(createUserDTO);
        if(response.getStatus().equals("error")){
            return new ResponseEntity<>(response, HttpStatusCode.valueOf(response.getStatusCode()));
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
