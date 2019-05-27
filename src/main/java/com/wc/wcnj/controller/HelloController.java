package com.wc.wcnj.controller;

import com.wc.wcnj.Service.TestStService;
import com.wc.wcnj.entity.TestSt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private TestStService testStService;
    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("ss","测试spring");
        List<TestSt> list=this.testStService.getall();
        System.out.println("测试数据:"+list.size());
        System.out.println("login"+list.get(0).getLoginName());
        return "login";
    }
}
