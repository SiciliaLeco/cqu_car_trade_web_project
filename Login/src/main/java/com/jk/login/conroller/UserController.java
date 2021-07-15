package com.jk.login.conroller;

import com.jk.login.info.ResultInfo;
import com.jk.login.pojo.User;
import com.jk.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/regist")
    public ResultInfo<User> regist(User user){
        return userService.registUser(user);
    }

    @PostMapping(value = "/login")
    public ResultInfo<User> login(User user){
        return userService.loginUser(user);
    }

    @PostMapping(value = "/updateUserPassword")
    public ResultInfo<User> updateUserPassword(User user){
        return userService.updateUserPassword(user);
    }

    @PostMapping(value = "/updateUserInfo")
    public ResultInfo<User> updateUserInfO(User user) {return userService.updateUserInfo(user);}

    @PostMapping(value = "/becomeVIP")
    public ResultInfo<User> becomeVIP(User user){return userService.becomeVIP(user);}
}
