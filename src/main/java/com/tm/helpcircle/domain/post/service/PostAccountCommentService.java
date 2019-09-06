package com.tm.helpcircle.domain.post.service;

import com.tm.helpcircle.domain.post.entity.PostAccountComment;
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

    public List<PostAccountComment>   getQuestions(Long postNO) {
        List<PostAccountComment> postAccountCommentList  = supper.getQuestions(postNO);
        return postAccountCommentList;
    }
}
