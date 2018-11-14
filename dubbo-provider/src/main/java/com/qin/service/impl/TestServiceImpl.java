package com.qin.service.impl;

import com.qin.service.TestService;
import com.qin.util.ProviderUtil;

public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!"+ ProviderUtil.getName();
    }
}

