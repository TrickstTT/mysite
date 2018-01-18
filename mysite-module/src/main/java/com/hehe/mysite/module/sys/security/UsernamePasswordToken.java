package com.hehe.mysite.module.sys.security;

public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken{
    private String validateCode;

    public UsernamePasswordToken(){
        super();
    }

    public UsernamePasswordToken(String username, String password, boolean rememberMe, String host, String validateCode){
        super(username, password, rememberMe, host);
        this.validateCode = validateCode;
    }

}
