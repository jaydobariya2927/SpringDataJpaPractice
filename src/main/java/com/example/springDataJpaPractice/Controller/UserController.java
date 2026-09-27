package com.example.springDataJpaPractice.Controller;

import com.example.springDataJpaPractice.Dto.CreateUserDto;
import com.example.springDataJpaPractice.Dto.UserDto;
import com.example.springDataJpaPractice.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v2/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto createUserDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(createUserDto));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUser() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getusers());
    }
}
