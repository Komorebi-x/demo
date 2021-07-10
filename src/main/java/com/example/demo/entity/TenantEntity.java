package com.example.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TenantEntity {
    private String tenant_id;
    private String tenant_code;
    private String tenant_name;
    private String tenant_responsibler;
    private String tenant_owner;
    private int valid_users_total;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date valid_start_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date valid_end_time;
    private String tenant_roles;
    private String remark;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date create_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date update_time;
    private String create_by;
    private String update_by;

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getTenant_code() {
        return tenant_code;
    }

    public void setTenant_code(String tenant_code) {
        this.tenant_code = tenant_code;
    }

    public String getTenant_name() {
        return tenant_name;
    }

    public void setTenant_name(String tenant_name) {
        this.tenant_name = tenant_name;
    }

    public String getTenant_responsibler() {
        return tenant_responsibler;
    }

    public void setTenant_responsibler(String tenant_responsibler) {
        this.tenant_responsibler = tenant_responsibler;
    }

    public String getTenant_owner() {
        return tenant_owner;
    }

    public void setTenant_owner(String tenant_owner) {
        this.tenant_owner = tenant_owner;
    }

    public int getValid_users_total() {
        return valid_users_total;
    }

    public void setValid_users_total(int valid_users_total) {
        this.valid_users_total = valid_users_total;
    }

    public Date getValid_start_time() {
        return valid_start_time;
    }

    public void setValid_start_time(Date valid_start_time) {
        this.valid_start_time = valid_start_time;
    }

    public Date getValid_end_time() {
        return valid_end_time;
    }

    public void setValid_end_time(Date valid_end_time) {
        this.valid_end_time = valid_end_time;
    }

    public String getTenant_roles() {
        return tenant_roles;
    }

    public void setTenant_roles(String tenant_roles) {
        this.tenant_roles = tenant_roles;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }
}
