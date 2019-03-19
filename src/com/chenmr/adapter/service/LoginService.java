package com.chenmr.adapter.service;

import com.chenmr.adapter.ResultMsg;
import com.chenmr.adapter.User;

/**
 * 旧的登录服务
 */
public class LoginService {

    public ResultMsg login(String userName, String password) {
        return new ResultMsg(200, "登录成功", new User(userName, password));
    }

}
