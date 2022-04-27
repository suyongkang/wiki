package com.su.wiki.service;

import com.su.wiki.domain.Demo;
import com.su.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
