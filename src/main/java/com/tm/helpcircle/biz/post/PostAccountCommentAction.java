package com.tm.helpcircle.biz.post;

import com.tm.helpcircle.domain.post.entity.PostAccountComment;
import com.tm.helpcircle.domain.post.service.PostAccountCommentService;
import com.tm.helpcircle.web.controller.config.WebReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Author XuLiang
 * create 2019-09-12 12:22
 */
@Component
public class PostAccountCommentAction {

    @Autowired
    private PostAccountCommentService  service;

    public Long quesInsertComment(PostAccountComment postAccountComment) {
        Long postAccountId = service.quesInsertComment(postAccountComment);
        return postAccountId;
    }
}
