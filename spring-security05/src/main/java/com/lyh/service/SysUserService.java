package com.lyh.service;

import com.lyh.entity.SysUser;
import com.lyh.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shenhj
 * @version 1.0.0
 * @date 2019/10/19 12:02
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id){
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name){
        return userMapper.selectByName(name);
    }


}
