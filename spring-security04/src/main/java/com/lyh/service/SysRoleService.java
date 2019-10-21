package com.lyh.service;

import com.lyh.entity.SysRole;
import com.lyh.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shenhj
 * @version 1.0.0
 * @date 2019/10/19 11:24
 */
@Service
public class SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}
