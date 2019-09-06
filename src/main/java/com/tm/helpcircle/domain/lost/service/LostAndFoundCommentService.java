package com.tm.helpcircle.domain.lost.service;

import com.tm.helpcircle.domain.lost.entity.LostAndFoundComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LostAndFoundCommentService {

    @Autowired
    private LostAndFoundCommentSupport support;

    public List<LostAndFoundComment> getQuestionsList(String lostArticleNo) {
        List<LostAndFoundComment> comments =  support.getQuestionsList(lostArticleNo);
        return comments;
    }
}
