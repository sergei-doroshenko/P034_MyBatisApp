package org.sdoroshenko.persistence;

import org.sdoroshenko.AbstractRepositoryTest;
import org.sdoroshenko.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class UserRepositoryTest extends AbstractRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUser() {
        User user = userRepository.getUserById(1L);
        System.out.println(user);
    }

}