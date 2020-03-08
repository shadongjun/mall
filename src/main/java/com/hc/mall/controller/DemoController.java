package com.hc.mall.controller;

import com.hc.mall.dto.DemoRequestDto;
import com.hc.mall.dto.DemoResponseDto;
import com.hc.mall.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("demo")
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("test")
    public List<DemoResponseDto> demo(DemoRequestDto demoRequestDto){
        return demoService.demo(demoRequestDto);
    }
}
