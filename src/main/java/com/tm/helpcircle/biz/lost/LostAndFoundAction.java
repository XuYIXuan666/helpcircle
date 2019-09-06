package com.tm.helpcircle.biz.lost;

import com.tm.helpcircle.domain.lost.entity.LostAndFound;
import com.tm.helpcircle.domain.lost.service.LostAndFoundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LostAndFoundAction {

    private final Logger logger = LoggerFactory.getLogger(LostAndFoundAction.class);

    @Autowired
    private LostAndFoundService lostAndFoundService;

    public int getInsert(LostAndFound lostAndFound) {
        int lostAndFoundId = lostAndFoundService.getInsert(lostAndFound);
        return lostAndFoundId;
    }
}
