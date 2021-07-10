package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/*相当于dao持久化层*/

@Repository
public interface UserMapper {

    public List<UserEntity> queryUserList();

    public List<UserEntity> queryUserByUserName(String userName);

    List<UserEntity>  queryUserByMap(Map<String,Object> params);

    int addUser(UserEntity userEntity);

    int updateUser(UserEntity userEntity);

    int deleteUser(int id);
}
