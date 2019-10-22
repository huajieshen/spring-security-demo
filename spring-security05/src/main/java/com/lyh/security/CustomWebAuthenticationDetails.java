package com.lyh.security;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取用户登录时携带的额外信息
 * @author shenhj
 * @version 1.0
 * @date 2019/10/21 21:13
 */

public class CustomWebAuthenticationDetails extends WebAuthenticationDetails {
    //该类提供了获取用户登录时携带的额外信息的功能，默认提供了 remoteAddress 与 sessionId 信息。

    private static final long serialVersionUID = 1L;
    private final String verifyCode;

    public CustomWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        // verifyCode为页面中验证码的name
        verifyCode = request.getParameter("verifyCode");
    }

    public String getVerifyCode(){
        return this.verifyCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("; VerifyCode: ").append(this.getVerifyCode());
        return sb.toString();
    }
}
