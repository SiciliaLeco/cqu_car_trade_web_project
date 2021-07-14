package com.jk.login;

import com.jk.login.info.ResultInfo;
import com.jk.login.mapper.UserMapper;
import com.jk.login.pojo.User;
import com.jk.login.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class

LoginApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Test
    void testLogin() {
        User user = new User();
        user.setBTel("13437100120");
        user.setBpassword("liqilin12345");
        user.setBName("重庆大学");
//        user.setUserName("test");
//        user.setUserPassword("123");
        ResultInfo user1 = userService.loginUser(user);
        System.out.println(user1);
    }
}
