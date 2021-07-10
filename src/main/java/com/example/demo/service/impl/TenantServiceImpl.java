package com.example.demo.service.impl;

import com.example.demo.entity.TenantEntity;
import com.example.demo.mapper.TenantMapper;
import com.example.demo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TenantServiceImpl implements TenantService {

    @Autowired
    TenantMapper tenantMapper;

    @Override
    public List<TenantEntity> queryTenantList() {
        return tenantMapper.queryTenantList();
    }

    @Override
    public List<TenantEntity> queryTenantByMap(Map<String, Object> params) {
        return tenantMapper.queryTenantByMap(params);
    }

    @Override
    public int addTenant(TenantEntity tenantEntity) {
        return tenantMapper.addTenant(tenantEntity);
    }

    @Override
    public int updateTenant(TenantEntity tenantEntity) {
        return tenantMapper.updateTenant(tenantEntity);
    }

    @Override
    public int deleteTenant(String tenant_id) {
        return tenantMapper.deleteTenant(tenant_id);
    }

    @Override
    public int addBatchTenant(List<TenantEntity> tenantEntity) {
        return tenantMapper.addBatchTenant(tenantEntity);
    }

    @Override
    public int deleteBatchTenant(List<TenantEntity> tenant_id) {
        return tenantMapper.deleteBatchTenant(tenant_id);
    }

}


