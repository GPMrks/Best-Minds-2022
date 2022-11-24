package BestMinds2022.OliveiraTrade.controller;

import BestMinds2022.OliveiraTrade.model.UserFA;
import BestMinds2022.OliveiraTrade.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name = "User Authentication Controller")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public void postUser(@RequestBody UserFA user) {
        userService.save(user);
    }
}