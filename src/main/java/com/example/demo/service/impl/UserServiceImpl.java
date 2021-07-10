package com.example.demo.service.impl;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public List<UserEntity> queryUserByUserName(String userName) {
        return userMapper.queryUserByUserName(userName);
    }

    @Override
    public List<UserEntity> queryUserByMap(Map<String, Object> params) {
        return userMapper.queryUserByMap(params);
    }

    @Override
    public int addUser(UserEntity userEntity) {
        return userMapper.addUser(userEntity);
    }

    @Override
    public int updateUser(UserEntity userEntity) {
        return userMapper.updateUser(userEntity);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
