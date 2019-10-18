package com.xm.helpcircle.domain.lost.service;

import com.xm.helpcircle.domain.lost.entity.LostAndFound;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:09
 */
@Component
public class LostAndFoundService {

    @Autowired
    private LostAndFoundSupport lostAndFoundSupport;

    public List<LostAndFoundWithBLOBs> getQuestionsList(String status, Integer pageSize, Long page, String lostName,String lostArticleClassification) {
        List<LostAndFoundWithBLOBs> lostAndFoundList = lostAndFoundSupport.getQuestionsList(status, pageSize, page, lostName,lostArticleClassification);
        return lostAndFoundList;
    }

    public LostAndFoundWithBLOBs getQuestions(String lostArticleNo) {
        LostAndFoundWithBLOBs lostAndFound = lostAndFoundSupport.getQuestions(lostArticleNo);
        return lostAndFound;
    }

    public int getInsert(LostAndFoundWithBLOBs lostAndFoundWithBLOBs) {
        int lostAndFoundId = lostAndFoundSupport.getInsert(lostAndFoundWithBLOBs);
        return lostAndFoundId;
    }
}
