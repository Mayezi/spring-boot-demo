package com.example.demordbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @author zhangyi_lc
 * DateTime: 2019-03-04 17:40
 */
@RestController
public class OnlineUserController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/count")
    public Map count() {
        Integer cnt=0;
        try {
            return jdbcTemplate.queryForMap("SELECT COUNT(*) CNT FROM USER");
        } catch (Exception e) {

        }
        return Collections.emptyMap();
    }
}
