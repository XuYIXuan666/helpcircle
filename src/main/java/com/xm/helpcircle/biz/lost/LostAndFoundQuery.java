package com.xm.helpcircle.biz.lost;

import com.xm.helpcircle.domain.lost.entity.LostAndFound;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundComment;
import com.xm.helpcircle.domain.lost.entity.LostAndFoundWithBLOBs;
import com.xm.helpcircle.domain.lost.service.LostAndFoundCommentService;
import com.xm.helpcircle.domain.lost.service.LostAndFoundService;
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
    @Autowired
    private LostAndFoundCommentService commentService;

    public List<LostAndFoundWithBLOBs> getQuestionsList(String status, Integer pageSize, Long page, String lostName) {
        List<LostAndFoundWithBLOBs> lostAndFoundList = lostAndFoundService.getQuestionsList(status, pageSize, page, lostName);
        if(lostAndFoundList != null){
            lostAndFoundList.forEach(lostAndFound -> {
                if(lostAndFound != null && lostAndFound.getLostArticleUrl() != null && !lostAndFound.getLostArticleUrl().equals("")){
                    List<String> strings = Arrays.asList(lostAndFound.getLostArticleUrl().split("\\|"));
                    if(strings.size() >= 1){
                        lostAndFound.setLostArticleUrl(Arrays.asList(lostAndFound.getLostArticleUrl().split("\\|")).get(0));
                    }
                }
            });
        }
        return lostAndFoundList;
    }

    public LostAndFoundWithBLOBs getQuestions(String lostArticleNo) {
        LostAndFoundWithBLOBs lostAndFound = lostAndFoundService.getQuestions(lostArticleNo);
        if(lostAndFound != null && lostAndFound.getLostArticleUrl() != null && !lostAndFound.getLostArticleUrl().equals("")){
            lostAndFound.setLostArticleUrlList(Arrays.asList(lostAndFound.getLostArticleUrl().split("\\|")));
        }
        //评论
        List<LostAndFoundComment> comments =  commentService.getQuestionsList(lostArticleNo);
        lostAndFound.setComments(comments);
        return lostAndFound;
    }

}
