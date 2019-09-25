package com.xm.helpcircle.domain.post.service;

import com.xm.helpcircle.domain.post.entity.PostAccount;
import com.xm.helpcircle.domain.post.entity.PostAccountWithBLOBs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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


    public List<PostAccountWithBLOBs> getQuestionsList(String status, Integer pageSize, Long page, String postName) {
        List<PostAccountWithBLOBs> postAccountList = supper.getQuestionsList(status, pageSize, page, postName);
        return postAccountList;
    }

    public PostAccountWithBLOBs getQuestions(Long lostArticleNo) {
        PostAccountWithBLOBs postAccount = supper.getQuestions(lostArticleNo);
        return postAccount;
    }

    public int getInsert(PostAccountWithBLOBs postAccountWithBLOBs) {
        int postAccountId = supper.getInsert(postAccountWithBLOBs);
        return postAccountId;
    }
}
