package com.neon.NeoN.service;


import com.neon.NeoN.models.dto.UserRegistrationDTO;
import com.neon.NeoN.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
