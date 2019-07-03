package com.webservice;

import com.webservice.service.TestService;
import com.webservice.service.TestService_Service;

public class TestWebServie {

    public static void main(String[] args) {
        TestService_Service testService_service = new TestService_Service();
        TestService testService = testService_service.getTestServiceImplPort();
        System.out.println(testService.hello("as"));
    }
}
