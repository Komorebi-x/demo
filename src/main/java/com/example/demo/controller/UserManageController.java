package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/*视图层管理Controller类*/
@Api(description = "用户服务平台")
@RestController
public class UserManageController {
    private final static Logger log = Logger.getLogger(UserManageController.class);

    @Autowired
    UserService userService;


    /*用户列表查询*/
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    @ApiOperation(value = "查询用户列表", notes = "查询用户列表", httpMethod = "GET")
    public R userList(){
        log.info("...UserManageController.userList GET start......");
        List<UserEntity> userEntityList = userService.queryUserList();
        log.info("...UserManageController.userList GET end......");

        log.debug("=====测试日志debug级别打印====\n");
        log.info("======测试日志info级别打印=====\n");
        log.warn("======测试日志warn级别打印=====\n");
        log.error("=====测试日志error级别打印====\n");


        return R.ok().put("data",userEntityList);

    }

    /*根据用户名查找*/
    @RequestMapping(value = "/user/queryUserByUserName",method = RequestMethod.GET)
    @ApiOperation(value = "根据用户名查找", notes = "根据用户名查找", httpMethod = "GET")
    public R queryUserByUserName(@RequestParam String userName){
        List<UserEntity> userList = userService.queryUserByUserName(userName);

        return R.ok().put("data",userList);

    }

    /*Map封装参数查询*/
    @RequestMapping(value = "/user/queryUserByMap", method = RequestMethod.POST)
    @ApiOperation(value = "Map封装参数查询", notes = "Map封装参数查询", httpMethod = "POST")
    public R queryUserByMap(@RequestBody Map<String,Object> params) {
        List<UserEntity>  userList = userService.queryUserByMap(params);

        return R.ok().put("data", userList);
    }


    /*新增用户*/
    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    @ApiOperation(value = "新增用户", notes = "新增用户", httpMethod = "GET")
    public R addUser(UserEntity userEntity){
        log.info("addUser userEntity : " + userEntity);
        log.info("... addUser ... request params is {} " + JSON.toJSONString(userEntity));
        int result = userService.addUser(userEntity);

        return R.ok().put("result",result);

    }

    /*更新用户*/
    @RequestMapping(value = "/user/update",method = RequestMethod.GET)
    @ApiOperation(value = "更新用户", notes = "更新用户", httpMethod = "GET")
    public R updateUser(UserEntity userEntity){
        int result = userService.updateUser(userEntity);

        return R.ok().put("result",result);

    }

    /*删除用户*/
    @RequestMapping(value = "/user/delete",method = RequestMethod.GET)
    @ApiOperation(value = "删除用户", notes = "删除用户", httpMethod = "GET")
    public R deleteUser(int id){
        int result = userService.deleteUser(id);

        return R.ok().put("result",result);

    }



}
