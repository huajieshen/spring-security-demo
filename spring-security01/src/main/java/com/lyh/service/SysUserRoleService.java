package com.lyh.service;

import com.lyh.entity.SysUserRole;
import com.lyh.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shenhj
 * @version 1.0.0
 * @date 2019/10/19 11:25
 */
@Service
public class SysUserRoleService {

    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId){
        return userRoleMapper.listByUserId(userId);
    }

}
