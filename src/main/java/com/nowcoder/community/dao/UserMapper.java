package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //根据ID查询用户的方法
    User selectById(int id);
    //根据姓名查询用户的方法
    User selectByName(String username);
    //根据邮箱查询用户的方法
    User selectByEmail(String email);
    // 插入用户,返回插入数据的行数
    int insertUser(User user);
    // 对用户状态修改
    int updateStatus(int id, int status);
    // 更新头像
    int updateHeader(int id,String headerUrl);
    // 更新密码
    int updatePassword(int id, String password);

}
