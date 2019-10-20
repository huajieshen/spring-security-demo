package com.lyh.entity;

import java.io.Serializable;

/**
 * @author shenhj
 * @version 1.0.0
 * @date 2019/10/19 11:05
 */
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
