package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.TenantEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.TenantService;
import com.example.demo.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Api(description = "租户服务平台")
@RestController

public class TenantManageController {
    private final static Logger log = Logger.getLogger(TenantManageController.class);

    @Autowired
    TenantService tenantService;

    /*列表查询*/
    @RequestMapping(value = "/tenant/list", method = RequestMethod.GET)
    @ApiOperation(value = "租户信息列表查询", notes = "租户信息列表查询", httpMethod = "GET")
    public R tenantList() {
        log.info("...TenantManageController.userList GET start......");
        List<TenantEntity> tenantEntityList = tenantService.queryTenantList();
        log.info("...TenantManageController.userList GET end......");

        log.debug("=====测试日志debug级别打印====\n");
        log.info("======测试日志info级别打印=====\n");
        log.warn("======测试日志warn级别打印=====\n");
        log.error("=====测试日志error级别打印====\n");

        return R.ok().put("data", tenantEntityList);

    }

    /*Map封装参数查询*/
    @RequestMapping(value = "/tenant/queryTenantByMap", method = RequestMethod.POST)
    @ApiOperation(value = "Map封装参数查询", notes = "Map封装参数查询", httpMethod = "POST")
    public R queryTenantByMap(@RequestBody Map<String, Object> params) {
        List<TenantEntity> tenantList = tenantService.queryTenantByMap(params);

        return R.ok().put("data", tenantList);
    }


    /*新增租户*/
    @RequestMapping(value = "/tenant/add", method = RequestMethod.GET)
    @ApiOperation(value = "新增租户", notes = "新增租户", httpMethod = "GET")
    public R addTenant(TenantEntity tenantEntity) {
        log.info("addTenant tenantEntity : " + tenantEntity);
        log.info("... addTenant ... request params is {} " + JSON.toJSONString(tenantEntity));
        int result = tenantService.addTenant(tenantEntity);

        return R.ok().put("result", result);

    }

    /*更新租户*/
    @RequestMapping(value = "/tenant/update", method = RequestMethod.GET)
    @ApiOperation(value = "更新租户", notes = "更新租户", httpMethod = "GET")
    public R updateTenant(TenantEntity tenantEntity) {
        int result = tenantService.updateTenant(tenantEntity);

        return R.ok().put("result", result);

    }

    /*删除租户*/
    @RequestMapping(value = "/tenant/delete", method = RequestMethod.GET)
    @ApiOperation(value = "删除租户", notes = "删除租户", httpMethod = "GET")
    public R deleteTenant(String tenant_id) {
        int result = tenantService.deleteTenant(tenant_id);

        return R.ok().put("result", result);

    }
/** 
 * @description: shfoahfo
        * @param: tenantEntity
        * @return: com.example.demo.utils.R
        * @author Qing
        * @date: 2021/7/10 17:47
 */ 
    /*批量增加租户*/
    @RequestMapping(value = "/tenant/addBatch", method = RequestMethod.POST)
    @ApiOperation(value = "批量新增租户", notes = "批量新增租户", httpMethod = "POST")
    public R addBatchTenant(@RequestBody List<TenantEntity> tenantEntity) {
        int result = tenantService.addBatchTenant(tenantEntity);

        return R.ok().put("result", result);

    }
/** 
 * @description: eere
        * @param: tenant_id
        * @return: com.example.demo.utils.R
        * @author Qing
        * @date: 2021/7/10 17:40
 */ 
    /*批量删除租户*/
    @RequestMapping(value = "/tenant/deleteBatch", method = RequestMethod.GET)
    @ApiOperation(value = "批量删除租户", notes = "批量删除租户", httpMethod = "GET")
    public R deleteBatchTenant(@RequestBody List<TenantEntity> tenant_id) {

        int result = tenantService.deleteBatchTenant(tenant_id);

        return R.ok().put("result", result);
    }
}
