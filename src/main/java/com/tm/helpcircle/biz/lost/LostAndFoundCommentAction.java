package com.tm.helpcircle.biz.lost;

import com.tm.helpcircle.domain.lost.entity.LostAndFoundComment;
import com.tm.helpcircle.domain.lost.service.LostAndFoundCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-12 12:29
 */
@Component
public class LostAndFoundCommentAction {

    @Autowired
    private LostAndFoundCommentService service;

    public Long quesInsertComment(LostAndFoundComment lostAndFoundComment) {
        Long lostAndFoundId = service.quesInsertComment(lostAndFoundComment);
        return lostAndFoundId;
    }
}
