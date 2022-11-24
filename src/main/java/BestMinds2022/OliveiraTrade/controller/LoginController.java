package BestMinds2022.OliveiraTrade.controller;

import BestMinds2022.OliveiraTrade.model.Login;
import BestMinds2022.OliveiraTrade.model.Session;
import BestMinds2022.OliveiraTrade.model.UserFA;
import BestMinds2022.OliveiraTrade.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name = "Login Controller")
public class LoginController {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Session login(@RequestBody Login login) {
        UserFA user = userService.findByUsername(login.getUsername());
        if (user != null) {
            boolean passwordOk = encoder.matches(login.getPassword(), user.getPassword());
            if (!passwordOk) {
                throw new RuntimeException("Password Inválido para Usuário: " + login.getUsername());
            }

            Session session = new Session();
            session.setLogin(user.getUsername());
            session.setMessage("Login efetuado com sucesso!");

            return session;
        } else {
            throw new RuntimeException("Erro ao logar!");
        }
    }

}
