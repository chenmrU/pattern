package com.chenmr.adapter.adapters;

import com.chenmr.adapter.ResultMsg;

/**
 * 新的登录接口
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForWeChat(String id);

}
