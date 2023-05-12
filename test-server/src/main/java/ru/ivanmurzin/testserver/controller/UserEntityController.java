package ru.ivanmurzin.testserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ivanmurzin.testserver.database.UserRepository;
import ru.ivanmurzin.testserver.model.UserEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userEntities")
public class UserEntityController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getById(@PathVariable Long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<UserEntity> save(@RequestBody UserEntity user) {
        if (userRepository.findById(user.getId()).isPresent()) return ResponseEntity.status(409).build();
        return ResponseEntity.ok(userRepository.save(user));
    }
}
