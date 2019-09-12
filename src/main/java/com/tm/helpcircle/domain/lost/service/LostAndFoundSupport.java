package com.tm.helpcircle.domain.lost.service;

import com.tm.helpcircle.domain.lost.entity.LostAndFound;
import com.tm.helpcircle.domain.lost.entity.LostAndFoundExample;
import com.tm.helpcircle.domain.lost.persistent.LostAndFoundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author XuLiang
 * create 2019-09-04 14:10
 */
@Component
public class LostAndFoundSupport {

    @Autowired
    private LostAndFoundMapper mapper;

    public List<LostAndFound> getQuestionsList(String status, Integer pageSize, Long page,String lostName) {
        LostAndFoundExample example = new LostAndFoundExample();
        example.createCriteria()
                .andLostArticleStatusEqualTo(status)
                .andLostArticleNameLike("%"+lostName+"%");
        example.setLimit(pageSize);
        example.setOffset((page-1)*pageSize);
        List<LostAndFound> lostAndFounds = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(lostAndFounds))
            return null;
        return lostAndFounds;
    }

    public LostAndFound getQuestions(String lostArticleNo) {
        LostAndFoundExample example = new LostAndFoundExample();
        example.createCriteria().andLostArticleNoEqualTo(lostArticleNo);
        List<LostAndFound> lostAndFounds = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(lostAndFounds))
            return null;
        return lostAndFounds.get(0);
    }

    public int getInsert(LostAndFound lostAndFound) {
        int lostAndFoundId = mapper.insertSelective(lostAndFound);
        return lostAndFoundId;
    }
}
