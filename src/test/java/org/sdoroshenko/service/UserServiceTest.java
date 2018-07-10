package org.sdoroshenko.service;

import org.sdoroshenko.AbstractRepositoryTest;
import org.sdoroshenko.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UserServiceTest extends AbstractRepositoryTest {

    @Autowired
    UserService userService;

    @Test
    public void getUserWithAddress() {
        User user = userService.getUserWithAddress(1L);
        System.out.println(user);
    }
}