package com.tm.helpcircle.biz.post;

import com.tm.helpcircle.domain.post.entity.PostAccount;
import com.tm.helpcircle.domain.post.service.PostAccountService;
import com.tm.helpcircle.web.controller.config.WebReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostAccountAction {

    @Autowired
    private PostAccountService service;

    public int getInsert(PostAccount postAccount) {
        int postAccountId = service.getInsert(postAccount);
        return postAccountId;
    }
}
