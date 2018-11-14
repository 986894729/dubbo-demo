package com.qin.service.impl;

import com.qin.service.IUserService;


/**
 * @Package: com.qin.service.impl
 * @Author: ganquan
 * @Date: Created in 2018/11/14 15:38
 * @Company: 杭州六六信息科技
 * @Copyright: Copyright (c) 2018
 */
public class UserService implements IUserService{

    @Override
    public String getUserName() {

        return "我叫做dubbo-provider";
    }
}
