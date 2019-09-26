package com.xm.helpcircle.domain.post.service;

import com.xm.helpcircle.domain.post.entity.PostAccountComment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostAccountCommentService {

    private final Logger logger = LoggerFactory.getLogger(PostAccountCommentService.class);

    @Autowired
    private PostAccountCommentSupper supper;

    public List<PostAccountComment>   getQuestions(String postNO) {
        List<PostAccountComment> postAccountCommentList  = supper.getQuestions(postNO);
        return postAccountCommentList;
    }

    public Long quesInsertComment(PostAccountComment postAccountComment) {
        Long postAccountId = supper.quesInsertComment(postAccountComment);
        return postAccountId;
    }
}
