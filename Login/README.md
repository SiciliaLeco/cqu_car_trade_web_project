# 基于SpringBoot的登录注册案例

这里用SpringBoot实现了一个简单的登录注册案例，所使用的的环境如下：

- Java_8
- IDEA_2019.2.3
- MySQL_8.0.17
- 其他的一些依赖版本查看POM树

## 这里用到的SQL语句如下

~~~sql
-- 创建数据库
CREATE DATABASE IF NOT EXISTS iotat character set utf8;
USE iotat;
-- 用户等级表
CREATE TABLE user_grade(
    gradeId INT(5) NOT NULL,
    gradeName VARCHAR(20) NOT NULL,
    PRIMARY KEY (gradeId)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- 插入用户等级数据
INSERT INTO user_grade VALUES
(1,"超级管理员"),
(2,"普通用户"),
(3,"游客");

-- 创建用户表

CREATE TABLE user(
    userId INT(5) NOT NULL AUTO_INCREMENT,
    userName VARCHAR(32) NOT NULL UNIQUE,
    userPassword VARCHAR(32) NOT NULL,
    userEmail VARCHAR(32),
    userGrade INT(5) NOT NULL,
    CONSTRAINT user_grade_id FOREIGN KEY (userGrade) REFERENCES user_grade(gradeId),
    PRIMARY KEY (userId)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- 插入超级管理员、实验室管理员和普通用户
INSERT INTO user VALUES
(1,"admin","111","admin@qq.com",1),
(2,"iotat","222","iotat@qq.com",2),
(3,"normal","333","normal@qq.com",3);
~~~

## 注意事项

- 使用时多关注application.properties相关配置。
- 使用关注userMapper.xml的配置。