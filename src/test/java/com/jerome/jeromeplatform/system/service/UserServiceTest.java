package com.jerome.jeromeplatform.system.service;

import com.jerome.jeromeplatform.system.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void getById() {
        User user = userService.findById(2L);
        System.out.println(user);
    }
}
