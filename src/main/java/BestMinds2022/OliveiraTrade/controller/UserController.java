package BestMinds2022.OliveiraTrade.controller;

import BestMinds2022.OliveiraTrade.model.UserFA;
import BestMinds2022.OliveiraTrade.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Tag(name = "User Creation Controller")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @Operation(summary = "Criação de Usuário", description = "Criação de Usuário com dados básicos")
    public ResponseEntity<String> postUser(@RequestBody UserFA user) {
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado com sucesso!");
    }
}