package com.xm.helpcircle.biz.user;

import com.xm.helpcircle.domain.user.entity.User;
import com.xm.helpcircle.domain.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author XuLiang
 * create 2019-09-12 13:15
 */
@Component
public class UserQuery {

    private final Logger logger = LoggerFactory.getLogger(UserQuery.class);

    @Autowired
    private UserService userService;

    public User selectById(String openid) {
        User user = userService.selectById(openid);
        return user;
    }
}
