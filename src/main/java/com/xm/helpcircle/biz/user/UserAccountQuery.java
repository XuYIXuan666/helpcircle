package com.xm.helpcircle.biz.user;

import com.xm.helpcircle.domain.user.entity.UserAccount;
import com.xm.helpcircle.domain.user.service.UserAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-25 17:01
 */
@Component
public class UserAccountQuery {

    private final Logger logger = LoggerFactory.getLogger(UserAccountQuery.class);

    @Autowired
    private UserAccountService userAccountService;

    public UserAccount selectByOpenId(String openid) {
        UserAccount userAccount = userAccountService.selectByOpenId(openid);
        return userAccount;
    }
}
