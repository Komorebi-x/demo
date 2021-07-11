package com.example.demo.mapper;

import com.example.demo.entity.TenantEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TenantMapper {
    public List<TenantEntity> queryTenantList();

    List<TenantEntity>  queryTenantByMap(Map<String,Object> params);


    int addTenant(TenantEntity tenantEntity);

    int updateTenant(TenantEntity tenantEntity);

    int deleteTenant(String tenant_id);

    int addBatchTenant(List<TenantEntity> list);

    int deleteBatchTenant(@Param("tenant_id")List<TenantEntity> tenant_id);
}
