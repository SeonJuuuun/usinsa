package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Long create(final UserSaveRequest req) {
        final User user = new User(req.email());
        final User savedUser = userRepository.save(user);
        return savedUser.getId();
    }
}
