package com.chenmr.adapter.adapters;

import com.chenmr.adapter.ResultMsg;
import com.chenmr.adapter.service.LoginService;

/**
 * 实现新接口，继承旧的登录服务
 */
public class PassportForThirdAdapter extends LoginService implements IPassportForThird{

    @Override
    public ResultMsg loginForQQ(String id) {
        String username = "QQ" + id;
        String password = null;
        return super.login(username, password);
    }

    @Override
    public ResultMsg loginForWeChat(String id) {
        String username = "WeChat" + id;
        String password = null;
        return super.login(username, password);
    }


}
