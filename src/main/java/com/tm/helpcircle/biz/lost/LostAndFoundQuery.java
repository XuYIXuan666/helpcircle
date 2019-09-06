package com.tm.helpcircle.biz.lost;

import com.tm.helpcircle.domain.lost.entity.LostAndFound;
import com.tm.helpcircle.domain.lost.service.LostAndFoundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:06
 */
@Component
public class LostAndFoundQuery {

    private final Logger logger = LoggerFactory.getLogger(LostAndFoundQuery.class);


    @Autowired
    private LostAndFoundService lostAndFoundService;

    public List<LostAndFound> getQuestionsList(Integer status, Integer pageSize, Long page) {
        List<LostAndFound> lostAndFoundList = lostAndFoundService.getQuestionsList(status, pageSize, page);
        lostAndFoundList.forEach(lostAndFound -> {
            lostAndFound.setLostArticleUrl(Arrays.asList(lostAndFound.getLostArticleUrl().split("\\|")).get(0));
        });
        return lostAndFoundList;
    }

    public LostAndFound getQuestions(String lostArticleNo) {
        LostAndFound lostAndFound = lostAndFoundService.getQuestions(lostArticleNo);
        lostAndFound.setLostArticleUrlList(Arrays.asList(lostAndFound.getLostArticleUrl().split("\\|")));
        return lostAndFound;
    }

}
