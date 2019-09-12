package com.tm.helpcircle.domain.post.service;

import com.tm.helpcircle.domain.post.entity.PostAccountComment;
import com.tm.helpcircle.domain.post.entity.PostAccountCommentExample;
import com.tm.helpcircle.domain.post.persistent.PostAccountCommentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class PostAccountCommentSupper {

    private final Logger logger = LoggerFactory.getLogger(PostAccountCommentSupper.class);

    @Autowired
    private PostAccountCommentMapper mapper;

    public List<PostAccountComment>  getQuestions(Long postNO) {
        PostAccountCommentExample example = new PostAccountCommentExample();
        example.createCriteria().andIdEqualTo(postNO);
        List<PostAccountComment> postAccountCommentList = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(postAccountCommentList))
            return null;
        return postAccountCommentList;
    }

    public Long quesInsertComment(PostAccountComment postAccountComment) {
        mapper.insertSelective(postAccountComment);
        return postAccountComment.getId();
    }
}
