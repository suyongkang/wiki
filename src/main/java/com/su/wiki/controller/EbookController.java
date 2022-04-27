package com.su.wiki.controller;

import com.su.wiki.req.EbookReq;
import com.su.wiki.resp.CommonResp;
import com.su.wiki.resp.EbookResp;
import com.su.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> commonResp = new CommonResp<>();
        commonResp.setContent(ebookService.list(req));
        return commonResp;
    }
}
