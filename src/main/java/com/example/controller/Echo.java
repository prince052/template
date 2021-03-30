package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ryan Xu
 * @Date 2021/3/29 14:21
 * @Description TODO
 **/
@RestController
@Api(tags = "我是测试")
public class Echo {

    @ApiOperation(value = "健康检测接口")
    @GetMapping("/echo")
    public String echo(){
        return "ok";
    }
}