package com.xm.helpcircle.biz.post;

import com.xm.helpcircle.domain.post.entity.PostAccountComment;
import com.xm.helpcircle.domain.post.service.PostAccountCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Author XuLiang
 * create 2019-09-12 12:22
 */
@Component
public class PostAccountCommentAction {

    @Autowired
    private PostAccountCommentService service;

    public Long quesInsertComment(PostAccountComment postAccountComment) {
        Long postAccountId = service.quesInsertComment(postAccountComment);
        return postAccountId;
    }
}
