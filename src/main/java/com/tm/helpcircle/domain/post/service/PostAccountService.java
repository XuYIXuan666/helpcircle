package com.tm.helpcircle.domain.post.service;

import com.tm.helpcircle.domain.post.entity.PostAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:36
 */
@Component
public class PostAccountService {

    private final Logger logger = LoggerFactory.getLogger(PostAccountService.class);

    @Autowired
    private PostAccountSupper supper;


    public List<PostAccount> getQuestionsList(Integer status, Integer pageSize, Long page) {
        List<PostAccount> postAccountList = supper.getQuestionsList(status, pageSize, page);
        return postAccountList;
    }

    public PostAccount getQuestions(Long lostArticleNo) {
        PostAccount postAccount = supper.getQuestions(lostArticleNo);
        return postAccount;
    }

    public int getInsert(PostAccount postAccount) {
        int postAccountId = supper.getInsert(postAccount);
        return postAccountId;
    }
}
