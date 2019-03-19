package com.chenmr.adapter;

import com.chenmr.adapter.adapters.PassportForThirdAdapter;

/**
 * 登录测试
 */
public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        PassportForThirdAdapter passportForThirdAdapter = new PassportForThirdAdapter();
        ResultMsg resultMsg = passportForThirdAdapter.loginForQQ("1069865896");
        System.out.println(resultMsg.getCode() + ":" + resultMsg.getData().getUserName() + ":" + resultMsg.getMsg());
    }


}
