package com.qin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.qin.controller
 * @Author: ganquan
 * @Date: Created in 2018/11/14 15:56
 * @Company: 杭州六六信息科技
 * @Copyright: Copyright (c) 2018
 */
@RestController
public class TestController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public String getUserName(@PathVariable("id") Integer id){

        return userService.getUserName() + id;
    }

}
