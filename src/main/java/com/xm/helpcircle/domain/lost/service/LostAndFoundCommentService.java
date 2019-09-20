package com.xm.helpcircle.domain.lost.service;

import com.xm.helpcircle.domain.lost.entity.LostAndFoundComment;
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

    public Long quesInsertComment(LostAndFoundComment lostAndFoundComment) {
        Long lostAndFoundId = support.quesInsertComment(lostAndFoundComment);
        return lostAndFoundId;
    }
}
