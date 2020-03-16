package com.zrq.gmall.web.ums.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户登录参数
 * Created by atguigu 4/26.
 */
public class UmsAdminLoginParam implements Serializable {
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
