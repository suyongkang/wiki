package com.su.wiki.controller;

import com.su.wiki.resp.CommonResp;
import com.su.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @Autowired
    private CommonResp<Object> commonResp;

    @GetMapping("/list")
    public CommonResp<Object> list(){
        commonResp.setContent(ebookService.list());
        return commonResp;
    }
}
