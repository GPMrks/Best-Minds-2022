package BestMinds2022.OliveiraTrade.service;

import BestMinds2022.OliveiraTrade.model.UserFA;
import BestMinds2022.OliveiraTrade.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    @Transactional
    public void save(UserFA user) {
        String pass = user.getPassword();
        user.setPassword(encoder.encode(pass));
        user.setId(generateUUID().substring(0, 6));
        userRepository.save(user);
    }

    public UserFA findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
