package com.xm.helpcircle.biz.user;

import com.xm.helpcircle.domain.user.entity.UserAccount;
import com.xm.helpcircle.domain.user.service.UserAccountService;
import com.xm.helpcircle.domain.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-25 17:02
 */
@Component
public class UserAccountAction {

    private final Logger logger = LoggerFactory.getLogger(UserAccountAction.class);

    @Autowired
    private UserAccountService userAccountService;

    public void insert(UserAccount userAccount) {

        userAccountService.insert(userAccount);
    }
}
