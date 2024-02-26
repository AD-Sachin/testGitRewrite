package com.rewrite.test.rewritetest.cotroller;

import com.rewrite.test.rewritetest.model.AppUser;
import com.rewrite.test.rewritetest.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping
    public List<AppUser> get() {
        return userRepo.findAll();
    }

    @PostMapping
    public ResponseEntity<String> post(@RequestBody AppUser user) {
        userRepo.save(user);
        return ResponseEntity.ok("User Saved");
    }

}
