package com.tm.helpcircle.domain.lost.service;

import com.tm.helpcircle.domain.lost.entity.LostAndFound;
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

    public List<LostAndFound> getQuestionsList(String status, Integer pageSize, Long page,String lostName) {
        List<LostAndFound> lostAndFoundList = lostAndFoundSupport.getQuestionsList(status, pageSize, page, lostName);
        return lostAndFoundList;
    }

    public LostAndFound getQuestions(String lostArticleNo) {
        LostAndFound lostAndFound = lostAndFoundSupport.getQuestions(lostArticleNo);
        return lostAndFound;
    }

    public int getInsert(LostAndFound lostAndFound) {
        int lostAndFoundId = lostAndFoundSupport.getInsert(lostAndFound);
        return lostAndFoundId;
    }
}
