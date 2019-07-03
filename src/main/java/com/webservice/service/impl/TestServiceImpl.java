package com.webservice.service.impl;

import com.webservice.service.TestService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(serviceName = "TestService", // 与接口中指定的name一致
        // 与接口中的命名空间一致,一般是接口的包名倒
        targetNamespace = "http://service.webservice.com",
        endpointInterface = "com.webservice.service.TestService")// 接口地址
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String name) {
        return "hello"+name;
    }

    @Override
    public String mytest() {
        return null;
    }
}
