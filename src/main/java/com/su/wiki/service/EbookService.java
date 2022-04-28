package com.su.wiki.service;

import com.su.wiki.domain.Ebook;
import com.su.wiki.domain.EbookExample;
import com.su.wiki.mapper.EbookMapper;
import com.su.wiki.req.EbookReq;
import com.su.wiki.resp.EbookResp;
import com.su.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebooks = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> ebookResps = new ArrayList<>();
//        for (Ebook ebook : ebooks) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//
//            //单体对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            ebookResps.add(ebookResp);
//        }

        //列表复制
        List<EbookResp> ebookResp = CopyUtil.copyList(ebooks, EbookResp.class);
        return ebookResp;
    }
}
