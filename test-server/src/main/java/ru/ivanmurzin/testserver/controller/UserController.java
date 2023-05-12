package ru.ivanmurzin.testserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ivanmurzin.testserver.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/users")
public class UserController {

    List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @PostMapping
    public ResponseEntity<List<User>> addUser(@RequestBody User newUser) {
        for (User user : users) {
            if (Objects.equals(user.getId(), newUser.getId())) {
                return ResponseEntity.status(409).build();
            }
        }
        users.add(newUser);
        return ResponseEntity.ok(users);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (Objects.equals(user.getId(), updatedUser.getId())) {
                users.set(i, updatedUser);
                return ResponseEntity.ok(users.get(i));
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/someone")
    public User getSomeone() {
        User.Pet pet = new User.Pet("Жужа", "Собака", 1000000);
        User user = new User(1L, "Pashka", "pashka@gmail.ru", pet);
        return user;
    }
}
