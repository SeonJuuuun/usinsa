package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Long> create(@RequestBody final UserSaveRequest req) {
        final Long userId = userService.create(req);
        return ResponseEntity.status(HttpStatus.CREATED).body(userId);
    }
}
