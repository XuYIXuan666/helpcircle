package com.xm.helpcircle.domain.user.service;

import com.xm.helpcircle.domain.user.entity.UserAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-25 17:04
 */
@Component
public class UserAccountService {

    private final Logger logger = LoggerFactory.getLogger(UserAccountService.class);

    @Autowired
    private UserAccountSupper supper;

    public void insert(UserAccount userAccount) {
        supper.insert(userAccount);
    }

    public UserAccount selectByOpenId(String openid) {
        UserAccount userAccount = supper.selectByOpenId(openid);
        return userAccount;
    }
}
