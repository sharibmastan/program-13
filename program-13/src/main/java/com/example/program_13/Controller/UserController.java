package com.example.program_13.Controller;

import com.example.program_13.Entity.Usermaster;
import com.example.program_13.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/Adduser")
    public Usermaster createUser(@RequestBody Usermaster user) {
        return userRepo.save(user);
    }

    @GetMapping
    public List<Usermaster> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Usermaster getUserById(@PathVariable int id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
    }

    @PutMapping("/{id}")
    public Usermaster updateUser(@PathVariable int id, @RequestBody Usermaster user) {
        Usermaster existingUser = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
        existingUser.setFullname(user.getFullname());
        return userRepo.save(existingUser);
    }

    @DeleteMapping("/{id}")
    public String deleteuser(@PathVariable int id) {
        userRepo.deleteById(id);
        return "Product deleted successfully with ID: " + id;
    }

}
