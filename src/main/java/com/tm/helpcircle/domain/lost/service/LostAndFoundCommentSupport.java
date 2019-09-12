package com.tm.helpcircle.domain.lost.service;


import com.tm.helpcircle.domain.lost.entity.LostAndFoundComment;
import com.tm.helpcircle.domain.lost.entity.LostAndFoundCommentExample;
import com.tm.helpcircle.domain.lost.persistent.LostAndFoundCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class LostAndFoundCommentSupport {

    @Autowired
    private LostAndFoundCommentMapper mapper;

    public List<LostAndFoundComment> getQuestionsList(String lostArticleNo) {
        LostAndFoundCommentExample example = new LostAndFoundCommentExample();
        example.createCriteria().andIdEqualTo(Long.parseLong(lostArticleNo));
        List<LostAndFoundComment> comments =  mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(comments))
            return null;
        return comments;
    }

    public Long quesInsertComment(LostAndFoundComment lostAndFoundComment) {
        mapper.insertSelective(lostAndFoundComment);
        return lostAndFoundComment.getId();
    }
}
