package com.tm.helpcircle.domain.post.service;

import com.tm.helpcircle.domain.lost.entity.LostAndFound;
import com.tm.helpcircle.domain.lost.entity.LostAndFoundExample;
import com.tm.helpcircle.domain.post.entity.PostAccount;
import com.tm.helpcircle.domain.post.entity.PostAccountExample;
import com.tm.helpcircle.domain.post.persistent.PostAccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:36
 */
@Component
public class PostAccountSupper {

    private final Logger logger = LoggerFactory.getLogger(PostAccountSupper.class);

    @Autowired
    private PostAccountMapper mapper;


    public List<PostAccount> getQuestionsList(Integer status, Integer pageSize, Long page) {
        PostAccountExample example = new PostAccountExample();
        example.createCriteria().andPostStatusEqualTo(status.toString());
        example.setLimit(pageSize);
        example.setOffset((page-1)*pageSize);
        List<PostAccount> lostAndFounds = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(lostAndFounds))
            return null;
        return lostAndFounds;
    }

    public PostAccount getQuestions(Long postNO) {
        PostAccountExample example = new PostAccountExample();
        example.createCriteria().andPostNoEqualTo(postNO.toString());
        List<PostAccount> lostAndFounds = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(lostAndFounds))
            return null;
        return lostAndFounds.get(0);
    }

    public int getInsert(PostAccount postAccount) {
        int postAccountId = mapper.insertSelective(postAccount);
        return postAccountId;
    }
}
