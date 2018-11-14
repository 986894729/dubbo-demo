package com.qin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qin.service.IUserService;
import com.qin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;
    @Autowired
    private IUserService userService;
    /**
     * 测试 JSON 接口
     * @param name 名字
     * @return
     */
    @RequestMapping("/test/{name}")
    public String testJson(@PathVariable("name") String name) {
        String str = "";
        String testStr = testService.sayHello(name);
        str = testStr;

        return str;
    }

    @RequestMapping(value = "/user/{id}")
    public String getUserName(@PathVariable("id") Integer id){

        String userName = userService.getUserName();

        return userName + id;
    }

}