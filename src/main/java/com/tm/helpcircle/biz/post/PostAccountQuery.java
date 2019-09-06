package com.tm.helpcircle.biz.post;

import com.tm.helpcircle.domain.post.entity.PostAccount;
import com.tm.helpcircle.domain.post.service.PostAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:07
 */
public class PostAccountQuery {

    private final Logger logger = LoggerFactory.getLogger(PostAccountQuery.class);

    @Autowired
    private PostAccountService postAccountService;

    public List<PostAccount> getQuestionsList(Integer status, Integer pageSize, Long page) {
        List<PostAccount> lostAndFoundList = postAccountService.getQuestionsList(status, pageSize, page);
        return lostAndFoundList;
    }
}
