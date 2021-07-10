package com.example.demo.service;
/*逻辑层*/


import com.example.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<UserEntity> queryUserList();

    public List<UserEntity> queryUserByUserName(String userName);

    List<UserEntity>  queryUserByMap(Map<String,Object> params);


    int addUser(UserEntity userEntity);

    int updateUser(UserEntity userEntity);

    int deleteUser(int id);

}
