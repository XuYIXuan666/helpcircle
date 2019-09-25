package com.xm.helpcircle.biz.lost;

import com.xm.helpcircle.domain.lost.entity.LostAndFoundWithBLOBs;
import com.xm.helpcircle.domain.lost.service.LostAndFoundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LostAndFoundAction {

    private final Logger logger = LoggerFactory.getLogger(LostAndFoundAction.class);

    @Autowired
    private LostAndFoundService lostAndFoundService;

    public int getInsert(LostAndFoundWithBLOBs lostAndFoundWithBLOBs) {
        int lostAndFoundId = lostAndFoundService.getInsert(lostAndFoundWithBLOBs);
        return lostAndFoundId;
    }
}
