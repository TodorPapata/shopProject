package com.paptashop.shop.controllers;

import com.paptashop.shop.entities.User;
import com.paptashop.shop.services.UserServiceInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceInteface userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = this.userService.getAllUsers();

        return ResponseEntity.ok().body(users);
    }

    @RequestMapping(value = "/currentUser",method = RequestMethod.GET)
    public ResponseEntity<User> getCurrentUser(@AuthenticationPrincipal User user){
        return ResponseEntity.ok().body(user);
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable("userId") Long userId){
        return ResponseEntity.ok()
                .body(this.userService.getById(userId));
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestParam @Valid @Validated User user) {
        return ResponseEntity.ok().body(this.userService.registerUser(user));
    }


}
