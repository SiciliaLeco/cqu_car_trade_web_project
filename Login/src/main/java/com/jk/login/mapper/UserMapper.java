package com.jk.login.mapper;

import com.jk.login.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //查询所有用户信息
    List<User> findAll();
    //根据用户名查询记录
    User findByUserTel(String userTel);
    //登录用户
    User loginUser(User user);
    //注册用户
    void registUser(User user);
    //修改用户密码
    void updateUserPassword(User user);
    // 开通VIP
    void becomeVIP(User user);
}
