package org.example.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    private final List<Authorities> userAuthorities = Arrays.asList(Authorities.READ, Authorities.WRITE);

    public List<Authorities> getUserAuthorities(String user, String password) {
        return userAuthorities;
    }
}
