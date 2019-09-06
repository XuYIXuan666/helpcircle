package com.tm.helpcircle.domain.post.service;

import com.tm.helpcircle.domain.post.entity.PostAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:36
 */
public class PostAccountService {

    private final Logger logger = LoggerFactory.getLogger(PostAccountService.class);

    @Autowired
    private PostAccountSupper supper;


    public List<PostAccount> getQuestionsList(Integer status, Integer pageSize, Long page) {
        List<PostAccount> lostAndFoundList = supper.getQuestionsList(status, pageSize, page);
        return lostAndFoundList;
    }
}
