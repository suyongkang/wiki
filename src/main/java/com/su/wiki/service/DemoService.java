package com.su.wiki.service;

import com.su.wiki.domain.Demo;
import com.su.wiki.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
