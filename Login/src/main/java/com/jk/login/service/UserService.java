package com.jk.login.service;

import com.jk.login.info.ResultInfo;
import com.jk.login.mapper.UserMapper;
import com.jk.login.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserService {
    @Autowired
    UserMapper userMapper;
    private ResultInfo<User> result = new ResultInfo<>();

    public ResultInfo<User> registUser(User user) {
        try {
            /**
             * 手机号码作为登录的方式。如果手机号码已经被使用则注册失败：
             * 在数据库中查找是否有该手机号的用户，若无则注册成功。
             * */
            User name = userMapper.findByUserTel(user.getBTel());
            if (name != null) {
                result.setMsg("该手机号已被使用，请重新输入手机号。");
            } else {
                userMapper.registUser(user);
                result.setMsg("注册成功，请返回登陆页面登陆。");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


    public ResultInfo<User> loginUser(User user) {
        try {
            User userExist = userMapper.loginUser(user);
            if (userExist == null) {
                result.setMsg("Phone number is wrong. Please retry!");
                result.setSuccess(false);
            } else {
                result.setMsg("Log in succeed!");
                user.setBTel(user.getBTel());
                result.setSuccess(true);
                user = userMapper.findByUserTel(user.getBTel());
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public ResultInfo<User> updateUserPassword(User user){
        userMapper.updateUserPassword(user);
        result.setMsg("修改成功");
        result.setSuccess(true);
        return result;
    }
}
