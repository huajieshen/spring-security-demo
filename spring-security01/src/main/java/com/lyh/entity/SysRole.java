package com.lyh.entity;

import java.io.Serializable;

/**
 * @author shenhj
 * @version 1.0.0
 * @date 2019/10/19 10:58
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
