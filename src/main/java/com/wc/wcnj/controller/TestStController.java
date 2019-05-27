package com.wc.wcnj.controller;

import com.wc.wcnj.Service.TestStService;
import com.wc.wcnj.entity.TestSt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TestStController {
    @Autowired
    private TestStService testStService;
    @RequestMapping(value = "testStList", method = RequestMethod.GET)
    public List<TestSt> getall() {
        List<TestSt> list = new ArrayList<TestSt>();
        list = this.testStService.getall();
        System.out.println("ss测试ss");
        return list;
    }
}
