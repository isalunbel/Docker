package org.example;
import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return Arrays.asList(Authorities.READ, Authorities.WRITE);
    }
}
