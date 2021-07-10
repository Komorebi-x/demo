package com.example.demo.service;

import com.example.demo.entity.TenantEntity;
import com.example.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface TenantService {
    public List<TenantEntity> queryTenantList();

    List<TenantEntity>  queryTenantByMap(Map<String,Object> params);


    int addTenant(TenantEntity tenantEntity);

    int updateTenant(TenantEntity tenantEntity);

    int deleteTenant(String tenant_id);

    int addBatchTenant(List<TenantEntity> tenantEntity);

    int deleteBatchTenant(List<TenantEntity> tenant_id);
}