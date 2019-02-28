package com.example.demohelloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyi_lc
 * DateTime: 2019-02-25 20:22
 */
@RestController
public class WebController {
    @RequestMapping("/{username}")
    public Map hello(@PathVariable String username) {
        Map<String, Object> ret = new HashMap<>(4);
        ret.put("username", username);
        ret.put("age", 18);
        ret.put("admin", true);
        ret.put("score", 18.0);
        return ret;
    }
    @RequestMapping("/")
    public String index() {
        return "Hello,Spring Boot";
    }
}
