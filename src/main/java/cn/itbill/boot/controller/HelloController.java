package cn.itbill.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 返回的数据会返回浏览器
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Handle01() {
        return "Hello SpringBoot";
    }
}
