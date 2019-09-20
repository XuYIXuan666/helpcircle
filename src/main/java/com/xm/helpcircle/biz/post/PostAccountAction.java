package com.xm.helpcircle.biz.post;

import com.xm.helpcircle.domain.post.entity.PostAccount;
import com.xm.helpcircle.domain.post.service.PostAccountService;
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
