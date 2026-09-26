package com.example.springDataJpaPractice.Service;

import com.example.springDataJpaPractice.Dto.CreateUserDto;
import com.example.springDataJpaPractice.Dto.UserDto;
import com.example.springDataJpaPractice.Repository.UserRepository;
import com.example.springDataJpaPractice.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserDto saveUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setName(createUserDto.getName());
        user.setEmail(createUserDto.getEmail());
        User savedUser = userRepository.save(user);

        return new UserDto(savedUser.getId(), savedUser.getName(),savedUser.getEmail());

    }
}
